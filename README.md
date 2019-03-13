# LBS Paas - Java KickStart



### Project Structure
    Requirements:
      * Java 1.8
      * Spring Framework Boot > 1.5.9 (web)
    
IDM Integration  
  
    <dependency>
        <groupId>com.lbs</groupId>
        <artifactId>oauth-client-9</artifactId>
    </dependency>
    
Kafka Integration
    
    
    <dependency>
        <groupId>com.lbs.paas.api</groupId>
        <artifactId>LbsMessaging</artifactId>
    </dependency>
Eureka Integration
    
    <dependency>
        <groupId>com.lbs.service.base</groupId>
        <artifactId>LbsBaseMicroService</artifactId>
    </dependency>



### Using Maven
Set the PaaS version in your `<properties>` section
```xml
<properties>
  <lbs.version>1.18.04</lbs.version>
</properties>
```
### IDM Integration

  Generic Filter for project
  
    @Bean
    protected FilterRegistrationBean oaFilter(Environment env) {
        FilterRegistrationBean frb = new FilterRegistrationBean(new OAFilter(env));
        frb.addUrlPatterns("/*");
        frb.addInitParameter(OAFilter.PERMITTED_URL_PATTERN, "^/(?:oauth|login|vaadinServlet|VAADIN|api/api-docs|api/diagnose)(?:|(?:[\\?#/].*))$" );
        frb.setName("Authentication Filter");
        return frb;
    }
   
  Outh2.0 Token Retrieved Event

    @Component
    public class TokenRetrievedEventListener implements ApplicationListener<TokenRetrievedEvent> {
    
        @Autowired
        private ApplicationContext context;
    
    
        @Override
        public void onApplicationEvent(TokenRetrievedEvent event) {
    
            ParseTokenResponseDto dto = event.getDto();
            LoggedInUserImpl loggedInUser = context.getBean(LoggedInUserImpl.class);
            loggedInUser.setFirstName(dto.getName());
            loggedInUser.setLastName(dto.getSurname());
            loggedInUser.setId(dto.getUserId());
            loggedInUser.setToken(event.getToken());
            
        }
    }
        
### Kafka Message Producer
    public class UserPayloadBuilder implements LbsProducerPayloadBuilder<UserDTO>
    {
        @Override
        public UserDTO build(ApplicationContext context, LbsMessageProducer lbsMessageProducer,
                  LbsMessage lbsMessage, Object bean, Method method, String[] parameterNames,
                  Object[] actualParameterValues, Object returnValue, Exception e) throws Exception {
                  
                  //TODO map variables...
        
        }
     }
     
   Service Method
   
     @LbsMessageProducer(name = USER_TOPIC, topic = USER_TOPIC, type = LbsMessageProducerType.BEGIN, payloadBuilderClass = UserPayloadBuilder.class)
     public void createUser(@LbsTenantId String tenantId, String username, String firstName, String lastName, Date birthDate)
     {
        //TODO implement service method
     }   
        
### Kafka Message Consumer
    public class UserParameterBuilder extends LbsConsumerParameterBuilder
    {
        @Override
        public void build(ObjectMapper objectMapper, String topic, LbsMessage lbsMessage, String messagePayload, Object[] parameters) throws Exception
        {
        }
    }   
     
   Service Method
   
     @LbsMessageConsumer(topic = USER_TOPIC, parameterBuilderClass = UserParameterBuilder.class)
     public void fetchUser(@LbsTenantId String tenantId, String username, String firstName, String lastName, Date birthDate){
         //TODO implement service method
     }


### Documentation

See our [Documentation](http://wiki.logo.com.tr/pages/viewpage.action?pageId=65132817).

### Links

[Kafka UI](http://localhost:9011/kafka)

[Cloud Control](http://test-win.logo-paas.com/cloudcontrolui)

[Activworks](http://test-services-b.logo-paas.com:8081)

### Screenshots

Local Kafka Integration UI
![alt text](https://i.ibb.co/484kfZK/kafka1.png)


Registered Kafka Topic
![alt text](https://i.ibb.co/KW9HPjT/registered-Message.png)


Process Definition
![alt text](https://i.ibb.co/12C1YP8/pd.png)


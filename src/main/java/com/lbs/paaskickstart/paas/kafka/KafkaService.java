package com.lbs.paaskickstart.paas.kafka;

import com.lbs.base.config.config.LbsTenantId;
import com.lbs.paas.messaging.annotation.EnableLbsMessaging;
import com.lbs.paas.messaging.annotation.LbsMessageConsumer;
import com.lbs.paas.messaging.annotation.LbsMessageProducer;
import com.lbs.paas.messaging.annotation.LbsMessageProducerType;
import com.lbs.paaskickstart.paas.kafka.conf.UserParameterBuilder;
import com.lbs.paaskickstart.paas.kafka.conf.UserPayloadBuilder;
import lombok.extern.log4j.Log4j;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@EnableKafka
//@EnableLbsMessaging
@Log4j
public class KafkaService {

   static final String USER_TOPIC = "lbs.kickstart.user";


    @LbsMessageProducer(name = USER_TOPIC, topic = USER_TOPIC, type = LbsMessageProducerType.BEGIN, payloadBuilderClass = UserPayloadBuilder.class)
    public void createUser(@LbsTenantId String tenantId, String username, String firstName, String lastName, Date birthDate)
    {
        //TODO implement your logic
    }

    @LbsMessageConsumer(topic = USER_TOPIC, parameterBuilderClass = UserParameterBuilder.class)
    public void fetchUser(@LbsTenantId String tenantId, String username, String firstName, String lastName, Date birthDate)
    {
        log.info("User created kafka message fetched for Username(FullName) : "+ username + " ( " + firstName + " " + lastName + " )");
    }
}

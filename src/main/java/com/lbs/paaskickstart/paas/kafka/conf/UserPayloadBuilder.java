package com.lbs.paaskickstart.paas.kafka.conf;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.context.ApplicationContext;

import com.lbs.paas.messaging.annotation.LbsMessageProducer;
import com.lbs.paas.messaging.config.producers.LbsProducerPayloadBuilder;
import com.lbs.paas.messaging.message.LbsMessage;

public class UserPayloadBuilder implements LbsProducerPayloadBuilder<UserDTO>
{
    @Override
    public UserDTO build(ApplicationContext context, LbsMessageProducer lbsMessageProducer,
                                  LbsMessage lbsMessage, Object bean, Method method, String[] parameterNames,
                                  Object[] actualParameterValues, Object returnValue, Exception e) throws Exception {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserName((String) actualParameterValues[1]);
        userDTO.setFirstName((String) actualParameterValues[2]);
        userDTO.setLastName((String) actualParameterValues[3]);
        userDTO.setBirthDate((Date) actualParameterValues[4]);
        return userDTO;
    }

}

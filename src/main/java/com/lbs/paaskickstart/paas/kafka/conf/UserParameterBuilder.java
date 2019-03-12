package com.lbs.paaskickstart.paas.kafka.conf;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lbs.paas.messaging.config.consumers.LbsConsumerParameterBuilder;
import com.lbs.paas.messaging.message.LbsMessage;

public class UserParameterBuilder extends LbsConsumerParameterBuilder
{
    @Override
    public void build(ObjectMapper objectMapper, String topic, LbsMessage lbsMessage, String messagePayload, Object[] parameters) throws Exception
    {
        UserDTO registerTopicPayload = objectMapper.readValue(messagePayload, UserDTO.class);
        parameters[0] = lbsMessage.getTenantId();
        parameters[1] = registerTopicPayload.getUserName();
        parameters[2] = registerTopicPayload.getFirstName();
        parameters[3] = registerTopicPayload.getLastName();
        parameters[4] = registerTopicPayload.getBirthDate();
    }
}

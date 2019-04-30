package com.lbs.paaskickstart.paas;

import com.lbs.oauthclient.spring.TokenRetrievedEvent;
import com.lbs.oauthclient.spring.common.ParseTokenResponseDto;
import com.lbs.paaskickstart.others.dto.LoggedInUserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


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
        loggedInUser.setTenantId(dto.getTenantId());
    }
}

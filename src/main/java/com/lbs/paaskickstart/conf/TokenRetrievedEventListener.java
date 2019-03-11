package com.lbs.paaskickstart.conf;

import com.lbs.oauthclient.spring.TokenRetrievedEvent;
import com.lbs.oauthclient.spring.common.ParseTokenResponseDto;
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


    }


}

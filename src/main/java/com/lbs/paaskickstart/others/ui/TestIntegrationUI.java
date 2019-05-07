package com.lbs.paaskickstart.others.ui;

import com.lbs.paaskickstart.others.dto.LoggedInUserImpl;
import com.lbs.paaskickstart.paas.kafka.KafkaService;
import com.lbs.paaskickstart.paas.service.JPlatformARPService;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;

@SpringUI(path = "menuAutoRegister")
public class TestIntegrationUI extends UI {

    @Autowired
    private JPlatformARPService jPlatformARPService;



    @Autowired
    private ApplicationContext applicationContext;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout contentLayout = new VerticalLayout();

        Button button1 = new Button("Get Arp");
        button1.addClickListener(e-> {
           String result = jPlatformARPService. get("18122018460745705203", applicationContext.getBean(LoggedInUserImpl.class).getToken().getAccessToken());
            System.out.println(result);

            Notification.show(result, Notification.Type.ERROR_MESSAGE);

        });

        contentLayout.addComponent(button1);
        setContent(contentLayout);
    }


}

package com.lbs.paaskickstart.others.ui;

import com.lbs.paaskickstart.others.dto.LoggedInUserImpl;
import com.lbs.paaskickstart.paas.kafka.KafkaService;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.time.ZoneId;
import java.util.Date;

@SpringUI(path = "kafka")
public class KafkaIntegrationUI extends UI {

    @Autowired
    private KafkaService kafkaService;
    @Autowired
    private ApplicationContext context;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Panel contentPanel = new Panel();
        contentPanel.setWidth(632, Unit.PIXELS);
        contentPanel.setHeight(700, Unit.PIXELS);
        VerticalLayout contentLayout = new VerticalLayout();
        contentLayout.addComponent(contentPanel);
        contentLayout.setSizeFull();
        contentLayout.setComponentAlignment(contentPanel, Alignment.MIDDLE_CENTER);
        contentPanel.addStyleName(ValoTheme.PANEL_WELL);
//        initMenuRegisterLayout();
        setContent(contentLayout);
        initKafkaIntegrationLayout();
        FormLayout kafkaIntegrationLayout = new FormLayout();
        TextField usernameField = new TextField("Username");
        TextField firstNameField = new TextField("First Name");
        TextField lastNameField = new TextField("Last Name");
        DateField birtDateField = new DateField("Birth Date");
        kafkaIntegrationLayout.addComponents(usernameField, firstNameField, lastNameField, birtDateField);
        kafkaIntegrationLayout.setStyleName(ValoTheme.FORMLAYOUT_LIGHT);


        VerticalLayout detailLayout = new VerticalLayout();
        Image image = new Image(null, new ExternalResource("https://i0.wp.com/thecuriousdev.org/wp-content/uploads/2017/12/kafka-logo-600x390.jpg?resize=600%2C390&ssl=1"));
        Button sendMessageButton = new Button("Save User");
        sendMessageButton.addStyleName(ValoTheme.BUTTON_PRIMARY);
        detailLayout.addComponents(image, kafkaIntegrationLayout, sendMessageButton);
        detailLayout.setComponentAlignment(image, Alignment.TOP_CENTER);
        detailLayout.setComponentAlignment(sendMessageButton, Alignment.BOTTOM_RIGHT);
        sendMessageButton.addClickListener(e-> {
            if(StringUtils.isBlank(usernameField.getValue()) || StringUtils.isBlank(firstNameField.getValue()) || StringUtils.isBlank(lastNameField.getValue()) || birtDateField.getValue() == null) {
                Notification.show("Please fill all fields");
                return;
            }
            Date date = Date.from(birtDateField.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
            kafkaService.createUser("8bc6ba5c-b1ed-4d67-a434-e82e940ff389", usernameField.getValue(), firstNameField.getValue(), lastNameField.getValue(), date);
            usernameField.setValue("");
            lastNameField.setValue("");
            firstNameField.setValue("");
            birtDateField.setValue(null);
        });
        contentPanel.setContent(detailLayout);
    }

    private void initKafkaIntegrationLayout() {




    }


    //TODO implement kafka intg. first
//    private void initMenuRegisterLayout(){
//        HorizontalLayout menuServiceLayout = new HorizontalLayout();
//        menuServiceLayout.setCaption("Menu Service Integration");
//        menuServiceLayout.setMargin(true);
//        menuServiceLayout.setWidth(100, Unit.PERCENTAGE);
//        menuServiceLayout.setStyleName(ValoTheme.LAYOUT_CARD);
//        TextField captionField = new TextField("Menu Caption");
//        TextField urlField = new TextField("Url");
//        Button saveButton = new Button("Save");
//        saveButton.addClickListener(e-> {
//            if(StringUtils.isBlank(urlField.getValue()) || StringUtils.isBlank(captionField.getValue())){
//                Notification.show("Please fill all required fields");
//            }
//            urlField.setValue("");
//            captionField.setValue("");
//            Notification.show("Menu registration status : " + result);
//        });
//
//        menuServiceLayout.addComponents(captionField, urlField, saveButton);
//        menuServiceLayout.setComponentAlignment(saveButton, Alignment.BOTTOM_RIGHT);
//        urlField.setWidth(100, Unit.PERCENTAGE);
//        menuServiceLayout.setExpandRatio(urlField, 1.0f);
//        contentLayout.addComponent(menuServiceLayout);
//    }
}

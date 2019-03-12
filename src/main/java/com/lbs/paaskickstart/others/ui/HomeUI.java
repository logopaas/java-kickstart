package com.lbs.paaskickstart.others.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.apache.commons.lang3.StringUtils;

@SpringUI
public class HomeUI extends UI {


    private VerticalLayout contentLayout;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        contentLayout = new VerticalLayout();
//        initMenuRegisterLayout();
        setContent(contentLayout);
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

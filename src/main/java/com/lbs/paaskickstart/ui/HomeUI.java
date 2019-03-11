package com.lbs.paaskickstart.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI
public class HomeUI extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Label("It Works"));
    }
}

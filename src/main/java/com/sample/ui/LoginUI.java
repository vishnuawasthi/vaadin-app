package com.sample.ui;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
@SpringUI

public class LoginUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		setContent(new Button("Click me", e->Notification.show("Hello Spring+Vaadin user!")));		
	}
	
	@WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = LoginUI.class)
    public static class Servlet extends VaadinServlet {
    }

	
}

package com.sample.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.UI;


@SpringUI(path="/registration")
public class RegistrationUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		setContent(new TextArea());

	}

}

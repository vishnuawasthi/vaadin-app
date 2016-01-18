package com.sample.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path="addressbook")
@Title("Addressbook")
@Theme(value = "valo")
public class AddressBookUI extends UI {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	TextField filter = new TextField();
	Grid contactList = new Grid();
	Button newContact = new Button("New contact");

	@Override
	protected void init(VaadinRequest request) {
		buildLayout();
		
	}
	
	private void buildLayout() {
		HorizontalLayout mainLayout = new HorizontalLayout();
		
		
		VerticalLayout verticalLayout = new VerticalLayout();
		
		//filter.setInputPrompt("Hi, Now you can enter your details...!!!");
		
		TextField firstName = new TextField("First Name");
		TextField lastName = new TextField("Last Name");
		TextField email = new TextField("Email Id");
		TextField mobile = new TextField("Mobile Number");
		
		/*mainLayout.addComponent(firstName);
		mainLayout.addComponent(lastName);
		mainLayout.addComponent(email);
		mainLayout.addComponent(mobile);*/
		
		verticalLayout.addComponent(firstName);
		verticalLayout.addComponent(lastName);
		verticalLayout.addComponent(email);
		verticalLayout.addComponent(mobile);
		
		
		
		
		setContent(mainLayout);
	}
	
	
}

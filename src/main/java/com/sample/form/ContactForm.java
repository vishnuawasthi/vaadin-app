package com.sample.form;

import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;

public class ContactForm  extends FormLayout{
	
	
	Button save = new Button("Save");
    Button cancel = new Button("Cancel");
    TextField firstName = new TextField("First name");
    TextField lastName = new TextField("Last name");
    TextField phone = new TextField("Phone");
    TextField email = new TextField("Email");
    DateField birthDate = new DateField("Birth date");
    
    
    
    
}

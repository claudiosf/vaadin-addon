package com.test.app;

import com.test.mycomponent.MyComponent;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class MyVaadinUI extends UI
{

    @Override
    protected void init(VaadinRequest request) {

        final MyComponent component = new MyComponent();
        component.setText("This is my component");
        addComponent(component);
        
        final TextField text = new TextField();
        addComponent(text);
        
        Button button = new Button("update state");
        button.addClickListener(new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {
                component.setText(text.getValue());
            }
        });
        addComponent(button);
    }

}

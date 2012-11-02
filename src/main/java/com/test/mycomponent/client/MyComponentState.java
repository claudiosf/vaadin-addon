package com.test.mycomponent.client;

import com.vaadin.shared.ComponentState;
import com.vaadin.shared.annotations.DelegateToWidget;

public class MyComponentState extends ComponentState {

	@DelegateToWidget("setText")
    public String text;

}
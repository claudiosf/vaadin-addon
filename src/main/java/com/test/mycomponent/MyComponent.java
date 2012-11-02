package com.test.mycomponent;

import com.test.mycomponent.client.MyComponentState;
import com.vaadin.ui.AbstractComponent;

public class MyComponent extends AbstractComponent {
	@Override
	public MyComponentState getState() {
		return (MyComponentState) super.getState();
	}

	public void setText(String text) {
		getState().text = text;
	}

	public String getText() {
		return getState().text;
	}
}

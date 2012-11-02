package com.test.mycomponent.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;

@Connect(com.test.mycomponent.MyComponent.class)
public class MyComponentConnector extends AbstractComponentConnector {
	@Override
	protected Widget createWidget() {
		return GWT.create(MyComponentWidget.class);
	}

	@Override
	public MyComponentWidget getWidget() {
		return (MyComponentWidget) super.getWidget();
	}

	@Override
	public MyComponentState getState() {
		return (MyComponentState) super.getState();
	}
}
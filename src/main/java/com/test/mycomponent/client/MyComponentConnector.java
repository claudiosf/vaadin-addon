package com.test.mycomponent.client;

import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;

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

	@Override
	public void onStateChanged(StateChangeEvent stateChangeEvent) {
		super.onStateChanged(stateChangeEvent);

		final String text = getState().text;
		getWidget().setText(text);
	}
}
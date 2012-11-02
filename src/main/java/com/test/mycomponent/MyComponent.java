package com.test.mycomponent;

import com.test.mycomponent.client.MyComponentServerRpc;
import com.test.mycomponent.client.MyComponentState;
import com.vaadin.shared.MouseEventDetails;
import com.vaadin.ui.AbstractComponent;

public class MyComponent extends AbstractComponent {
	
	private int clickCount = 0;

    private MyComponentServerRpc rpc = new MyComponentServerRpc() {
        public void clicked(MouseEventDetails mouseDetails) {
            clickCount++;
            setText("You have clicked " + clickCount + " times");
        }
    };

    public MyComponent() {
        registerRpc(rpc);
    }
	
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

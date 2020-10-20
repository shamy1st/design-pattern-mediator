package com.shamy1st.mediator;

public class Button extends UIControl {

	private boolean isEnabled;

	public Button(DialogBox owner) {
		super(owner);
	}
	
	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
		this.getOwner().changed(this);
	}
}

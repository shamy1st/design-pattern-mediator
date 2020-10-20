package com.shamy1st.mediator;

public class UIControl {

	private DialogBox owner;

	public UIControl(DialogBox owner) {
		this.owner = owner;
	}

	protected DialogBox getOwner() {
		return owner;
	}
}

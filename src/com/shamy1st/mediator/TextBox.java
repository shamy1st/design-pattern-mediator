package com.shamy1st.mediator;

public class TextBox extends UIControl {

	private String content;
	
	public TextBox(DialogBox owner) {
		super(owner);
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		this.getOwner().changed(this);
	}
}

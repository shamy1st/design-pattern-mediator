package com.shamy1st.mediator;

public class ListBox extends UIControl {
	
	private String selection;
	
	public ListBox(DialogBox owner) {
		super(owner);
	}
	
	public String getSelection() {
		return selection;
	}

	public void setSelection(String selection) {
		this.selection = selection;
		this.getOwner().changed(this);
	}
}

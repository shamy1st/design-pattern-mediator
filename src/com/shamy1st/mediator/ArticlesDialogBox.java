package com.shamy1st.mediator;

public class ArticlesDialogBox extends DialogBox {
	
	private ListBox articlesListBox = new ListBox(this);
	private TextBox titleTextBox = new TextBox(this);
	private Button saveButton = new Button(this);
	
	public void testCase1() {
		articlesListBox.setSelection("Article 1");
		titleTextBox.setContent("");
		titleTextBox.setContent("Article 2");
		System.out.println("TextBox: " + titleTextBox.getContent());
		System.out.println("SaveButton: " + saveButton.isEnabled());
	}
	
	@Override
	public void changed(UIControl control) {
		if(control == articlesListBox)
			onArticleSelected();
		else if(control == titleTextBox)
			onTitleEdited();
		else if(control == saveButton)
			onSaveClicked();
	}
	
	private void onArticleSelected() {
		titleTextBox.setContent(articlesListBox.getSelection());
		saveButton.setEnabled(true);
	}
	
	private void onTitleEdited() {
		saveButton.setEnabled(!titleTextBox.getContent().isEmpty());
	}
	
	private void onSaveClicked() {
		
	} 
}

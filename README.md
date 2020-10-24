# Mediator Design Pattern (Java)
**Mediator** object encapsulates how a set of objects interact.
![](https://github.com/shamy1st/design-pattern-mediator/blob/main/uml.png)
### Problem: 
You have **ListBox** and when choose item from it, you should change the **TextBox** (content) and **Button** (enable/disable).
![](https://github.com/shamy1st/design-pattern-mediator/blob/main/uml-problem.png)

    public class UIControl {

    }

    public class ListBox extends UIControl {
        private String selection;
        
        public String getSelection() {
            return selection;
        }
        
        public void setSelection(String selection) {
            this.selection = selection;
        }
    }

    public class TextBox extends UIControl {
        private String content;
        
        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

    public class Button extends UIControl {
        private boolean isEnabled;
        
        public boolean isEnabled() {
            return isEnabled;
        }
        
        public void setEnabled(boolean isEnabled) {
            this.isEnabled = isEnabled;
        }
    }
### Solution:
![](https://github.com/shamy1st/design-pattern-mediator/blob/main/uml-solution.png)

package com.stackoverflow.api;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * Value Change Listener to JTextField
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3953219">https://stackoverflow.com/a/3953219</a>
 */
public class APIzator3953219 {

  public static void listener() throws RuntimeException {
    // Listen for changes in the text
    textField
      .getDocument()
      .addDocumentListener(
        new DocumentListener() {

          public void changedUpdate(DocumentEvent e) {
            warn();
          }

          public void removeUpdate(DocumentEvent e) {
            warn();
          }

          public void insertUpdate(DocumentEvent e) {
            warn();
          }

          public void warn() {
            if (Integer.parseInt(textField.getText()) <= 0) {
              JOptionPane.showMessageDialog(
                null,
                "Error: Please enter number bigger than 0",
                "Error Massage",
                JOptionPane.ERROR_MESSAGE
              );
            }
          }
        }
      );
  }
}

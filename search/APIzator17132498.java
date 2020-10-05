package com.stackoverflow.api;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * Java - Check if JTextField is empty or not
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17132498">https://stackoverflow.com/a/17132498</a>
 */
public class APIzator17132498 {

  public static void check() throws RuntimeException {
    yourJTextField
      .getDocument()
      .addDocumentListener(
        new DocumentListener() {

          public void changedUpdate(DocumentEvent e) {
            changed();
          }

          public void removeUpdate(DocumentEvent e) {
            changed();
          }

          public void insertUpdate(DocumentEvent e) {
            changed();
          }

          public void changed() {
            if (yourJTextField.getText().equals("")) {
              loginButton.setEnabled(false);
            } else {
              loginButton.setEnabled(true);
            }
          }
        }
      );
  }
}

package com.stackoverflow.api;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextField;

/**
 * How to Set Focus on JTextField?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6723316">https://stackoverflow.com/a/6723316</a>
 */
public class APIzator6723316 {

  public static void setFocus() throws RuntimeException {
    in = new JTextField(40);
    f.addWindowListener(
      new WindowAdapter() {

        public void windowOpened(WindowEvent e) {
          in.requestFocus();
        }
      }
    );
  }
}

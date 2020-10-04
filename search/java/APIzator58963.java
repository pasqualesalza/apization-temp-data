package com.stackoverflow.api;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JComboBox Selection Change Listener?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/58963">https://stackoverflow.com/a/58963</a>
 */
public class APIzator58963 {

  public static void listener() throws RuntimeException {
    combo.addActionListener(
      new ActionListener() {

        public void actionPerformed(ActionEvent e) {
          doSomething();
        }
      }
    );
  }
}

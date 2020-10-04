package com.stackoverflow.api;

import javax.swing.JButton;
import javax.swing.text.html.Map;

/**
 * Map.Entry : How to use it?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8689757">https://stackoverflow.com/a/8689757</a>
 */
public class APIzator8689757 {

  public static void map() throws RuntimeException {
    for (Map.Entry<String, JButton> entry : listbouton.entrySet()) {
      String key = entry.getKey();
      JButton value = entry.getValue();
      this.add(value);
    }
  }
}

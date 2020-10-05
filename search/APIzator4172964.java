package com.stackoverflow.api;

import android.graphics.Color;
import javax.swing.JButton;

/**
 * How to set background color of a button in Java GUI?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4172964">https://stackoverflow.com/a/4172964</a>
 */
public class APIzator4172964 {

  public static void setColor() throws RuntimeException {
    for (int i = 1; i <= 9; i++) {
      JButton btn = new JButton(String.valueOf(i));
      btn.setBackground(Color.BLACK);
      btn.setForeground(Color.GRAY);
      p3.add(btn);
    }
  }
}

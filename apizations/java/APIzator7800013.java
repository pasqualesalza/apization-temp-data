package com.stackoverflow.api;

import javax.swing.WindowConstants;

/**
 * JFrame Exit on close Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7800013">https://stackoverflow.com/a/7800013</a>
 */
public class APIzator7800013 {

  public static void exit() throws RuntimeException {
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
  }
}

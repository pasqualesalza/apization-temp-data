package com.stackoverflow.api;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * How to set JFrame to appear centered, regardless of monitor resolution?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2442610">https://stackoverflow.com/a/2442610</a>
 */
public class APIzator2442610 {

  public static void setJframe() throws RuntimeException {
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(
        dim.width / 2 - this.getSize().width / 2,
        dim.height / 2 - this.getSize().height / 2
      );
  }
}

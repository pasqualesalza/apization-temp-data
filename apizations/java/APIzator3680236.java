package com.stackoverflow.api;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

/**
 * How can I get screen resolution in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3680236">https://stackoverflow.com/a/3680236</a>
 */
public class APIzator3680236 {

  public static int getResolution() throws RuntimeException {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double width = screenSize.getWidth();
    double height = screenSize.getHeight();
    GraphicsDevice gd = GraphicsEnvironment
      .getLocalGraphicsEnvironment()
      .getDefaultScreenDevice();
    int width = gd.getDisplayMode().getWidth();
    return gd.getDisplayMode().getHeight();
  }
}

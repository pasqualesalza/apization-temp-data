package com.stackoverflow.api;

import javax.swing.SwingUtilities;

/**
 * How can I refresh or reload the JFrame?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7630604">https://stackoverflow.com/a/7630604</a>
 */
public class APIzator7630604 {

  public static void refresh() throws RuntimeException {
    SwingUtilities.updateComponentTreeUI(frame);
    frame.invalidate();
    frame.validate();
    frame.repaint();
  }
}

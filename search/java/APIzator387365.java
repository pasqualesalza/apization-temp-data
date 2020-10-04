package com.stackoverflow.api;

/**
 * How to bring a window to the front?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/387365">https://stackoverflow.com/a/387365</a>
 */
public class APIzator387365 {

  public static void bringWindow() throws RuntimeException {
    java.awt.EventQueue.invokeLater(
      new Runnable() {

        @Override
        public void run() {
          myFrame.toFront();
          myFrame.repaint();
        }
      }
    );
  }
}

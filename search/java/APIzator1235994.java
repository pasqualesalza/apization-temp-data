package com.stackoverflow.api;

import com.sun.glass.events.WindowEvent;

/**
 * How to programmatically close a JFrame
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1235994">https://stackoverflow.com/a/1235994</a>
 */
public class APIzator1235994 {

  public static void closeJframe() throws RuntimeException {
    frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
  }
}

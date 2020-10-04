package com.stackoverflow.api;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * How are Anonymous (inner) classes used in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/355177">https://stackoverflow.com/a/355177</a>
 */
public class APIzator355177 {

  public static void be() throws RuntimeException {
    button.addActionListener(
      new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          // do something
        }
      }
    );
  }
}

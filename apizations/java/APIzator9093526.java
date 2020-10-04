package com.stackoverflow.api;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * How to capture a JFrame's close button click event?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9093526">https://stackoverflow.com/a/9093526</a>
 */
public class APIzator9093526 {

  public static void captureEvent() throws RuntimeException {
    /*Some piece of code*/
    frame.addWindowListener(
      new java.awt.event.WindowAdapter() {

        @Override
        public void windowClosing(java.awt.event.WindowEvent windowEvent) {
          if (
            JOptionPane.showConfirmDialog(
              frame,
              "Are you sure to close this window?",
              "Really Closing?",
              JOptionPane.YES_NO_OPTION,
              JOptionPane.QUESTION_MESSAGE
            ) ==
            JOptionPane.YES_OPTION
          ) {
            System.exit(0);
          }
        }
      }
    );
    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  }
}

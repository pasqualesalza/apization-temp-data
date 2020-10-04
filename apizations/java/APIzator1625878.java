package com.stackoverflow.api;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * How to disable javax.swing.JButton in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1625878">https://stackoverflow.com/a/1625878</a>
 */
public class APIzator1625878 {

  public static void disable() throws RuntimeException {
    JButton startButton = new JButton("Start");
    startButton.addActionListener(
      new ActionListener() {

        public void actionPerformed(ActionEvent ae) {
          startButton.setEnabled(false);
          stopButton.setEnabled(true);
        }
      }
    );
  }
}

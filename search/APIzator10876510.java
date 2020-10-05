package com.stackoverflow.api;

import android.view.KeyEvent;

/**
 * How to use KeyListener
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10876510">https://stackoverflow.com/a/10876510</a>
 */
public class APIzator10876510 {

  public static void keyPressed(KeyEvent e) {
    int key = e.getKeyCode();
    if (key == KeyEvent.VK_LEFT) {
      dx = -1;
    }
    if (key == KeyEvent.VK_RIGHT) {
      dx = 1;
    }
    if (key == KeyEvent.VK_UP) {
      dy = -1;
    }
    if (key == KeyEvent.VK_DOWN) {
      dy = 1;
    }
  }
}

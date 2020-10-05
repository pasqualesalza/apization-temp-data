package com.stackoverflow.api;

import android.view.KeyEvent;

/**
 * How to check if the key pressed was an arrow key in Java KeyListener?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/617004">https://stackoverflow.com/a/617004</a>
 */
public class APIzator617004 {

  public static void keyPressed(KeyEvent e) {
    int keyCode = e.getKeyCode();
    switch (keyCode) {
      case KeyEvent.VK_UP:
        // handle up
        break;
      case KeyEvent.VK_DOWN:
        // handle down
        break;
      case KeyEvent.VK_LEFT:
        // handle left
        break;
      case KeyEvent.VK_RIGHT:
        // handle right
        break;
    }
  }
}

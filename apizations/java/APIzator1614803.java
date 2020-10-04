package com.stackoverflow.api;

import javax.swing.ImageIcon;

/**
 * How to change JFrame icon
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1614803">https://stackoverflow.com/a/1614803</a>
 */
public class APIzator1614803 {

  public static void changeIcon() throws RuntimeException {
    ImageIcon img = new ImageIcon(pathToFileOnDisk);
    myFrame.setIconImage(img.getImage());
  }
}

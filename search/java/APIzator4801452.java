package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.html.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * How do I add an image to a JButton
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4801452">https://stackoverflow.com/a/4801452</a>
 */
public class APIzator4801452 {

  public static void addImage() throws RuntimeException {
    JButton button = new JButton();
    try {
      Image img = ImageIO.read(getClass().getResource("resources/water.bmp"));
      button.setIcon(new ImageIcon(img));
    } catch (Exception ex) {
      System.out.println(ex);
    }
  }
}

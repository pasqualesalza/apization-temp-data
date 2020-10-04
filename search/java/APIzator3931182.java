package com.stackoverflow.api;

import com.google.appengine.api.images.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Java: how to add image to Jlabel?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3931182">https://stackoverflow.com/a/3931182</a>
 */
public class APIzator3931182 {

  public static void java() throws RuntimeException {
    // this generates an image file
    Image image = GenerateImage.toImage(true);
    ImageIcon icon = new ImageIcon(image);
    JLabel thumb = new JLabel();
    thumb.setIcon(icon);
  }
}

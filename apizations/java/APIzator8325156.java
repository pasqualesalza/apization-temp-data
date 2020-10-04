package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**
 * How to create file object from URL object
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8325156">https://stackoverflow.com/a/8325156</a>
 */
public class APIzator8325156 {

  public static void createObject(String str1, String str2)
    throws RuntimeException {
    URL url = new URL(str1);
    BufferedImage img = ImageIO.read(url);
    File file = new File(str2);
    ImageIO.write(img, "jpg", file);
  }
}

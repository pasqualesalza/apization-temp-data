package com.stackoverflow.api;

import android.graphics.Color;
import com.google.gwt.user.client.Random;

/**
 * Creating random colour in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4246418">https://stackoverflow.com/a/4246418</a>
 */
public class APIzator4246418 {

  public static void createColour() throws RuntimeException {
    Random rand = new Random();
    Color randomColor = new Color(r, g, b);
    randomColor.brighter();
  }
}

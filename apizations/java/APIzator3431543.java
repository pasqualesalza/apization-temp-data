package com.stackoverflow.api;

import android.renderscript.Element;

/**
 * Java, How do I get current index/key in "for each" loop
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3431543">https://stackoverflow.com/a/3431543</a>
 */
public class APIzator3431543 {

  public static void getIndex() throws RuntimeException {
    int index = 0;
    for (Element song : question) {
      System.out.println("Current index is: " + (index++));
    }
    for (int i = 0; i < question.length; i++) {
      System.out.println("Current index is: " + i);
    }
  }
}

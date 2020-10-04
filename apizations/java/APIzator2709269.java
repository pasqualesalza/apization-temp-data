package com.stackoverflow.api;

/**
 * Converting a string to an integer on Android
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2709269">https://stackoverflow.com/a/2709269</a>
 */
public class APIzator2709269 {

  public static void convertString() throws RuntimeException {
    Integer.parseInt(et.getText().toString());
    int myNum = 0;
    try {
      myNum = Integer.parseInt(et.getText().toString());
    } catch (NumberFormatException nfe) {
      System.out.println("Could not parse " + nfe);
    }
  }
}

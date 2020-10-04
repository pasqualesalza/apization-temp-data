package com.stackoverflow.api;

/**
 * What does the 'static' keyword do in a class?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/413904">https://stackoverflow.com/a/413904</a>
 */
public class APIzator413904 {

  public class Example {
    private static boolean staticField;

    private boolean instanceField;

    public static void do_() {
      // a static method can access static fields
      staticField = true;
      // a static method can access instance fields through an object reference
      Example instance = new Example();
      instance.instanceField = true;
    }
  }
}

package com.stackoverflow.api;

/**
 * How to use null in switch
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10332167">https://stackoverflow.com/a/10332167</a>
 */
public class APIzator10332167 {

  public static void useNull() throws RuntimeException {
    if (i == null) {
      doSomething0();
    } else {
      switch (i) {
        case 1:
          // ...
          break;
      }
    }
  }
}

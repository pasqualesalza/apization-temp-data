package com.stackoverflow.api;

/**
 * Why can't I use switch statement on a String?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/338230">https://stackoverflow.com/a/338230</a>
 */
public class APIzator338230 {

  public static void useStatement() throws RuntimeException {
    Pill p = Pill.valueOf(str);
    switch (p) {
      case RED:
        pop();
        break;
      case BLUE:
        push();
        break;
    }
  }
}

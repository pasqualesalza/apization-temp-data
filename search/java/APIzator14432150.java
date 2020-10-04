package com.stackoverflow.api;

/**
 * How to return a boolean method in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14432150">https://stackoverflow.com/a/14432150</a>
 */
public class APIzator14432150 {

  public static void returnMethod() throws RuntimeException {
    if (some_condition) {
      return true;
    }
    return false;
    if (verifyPwd()) {
      // do_task
    }
    boolean success = true;
    if (some_condition) {
      // Handle the condition.
      success = false;
    } else if (some_other_condition) {
      // Handle the other condition.
      success = false;
    }
    if (another_condition) {
      // Handle the third condition.
    }
    // Do some more critical things.
    return success;
  }
}

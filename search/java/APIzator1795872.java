package com.stackoverflow.api;

/**
 * && (AND) and || (OR) in IF statements
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1795872">https://stackoverflow.com/a/1795872</a>
 */
public class APIzator1795872 {

  public static void execute() throws RuntimeException {
    if (str != null && !str.isEmpty()) {
      doSomethingWith(str.charAt(0));
    }
    if (str == null || str.isEmpty()) {
      complainAboutUnusableString();
    } else {
      doSomethingWith(str.charAt(0));
    }
  }
}

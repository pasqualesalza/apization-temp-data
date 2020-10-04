package com.stackoverflow.api;

/**
 * How can a Java program get its own process ID?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/35885">https://stackoverflow.com/a/35885</a>
 */
public class APIzator35885 {

  public static long getId() throws RuntimeException {
    return ProcessHandle.current().pid();
  }
}

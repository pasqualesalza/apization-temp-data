package com.stackoverflow.api;

/**
 * How do I programmatically determine operating system in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/228481">https://stackoverflow.com/a/228481</a>
 */
public class APIzator228481 {

  public class ShowProperties {

    public static void determineSystem() {
      System.getProperties().list(System.out);
    }
  }
}

package com.stackoverflow.api;

/**
 * Take a char input from the Scanner
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13942707">https://stackoverflow.com/a/13942707</a>
 */
public class APIzator13942707 {

  public static char takeInput() throws RuntimeException {
    char c = reader.next().charAt(0);
    char c = reader.findInLine(".").charAt(0);
    return reader.next(".").charAt(0);
  }
}

package com.stackoverflow.api;

/**
 * Replace a character at a specific index in a string?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6952379">https://stackoverflow.com/a/6952379</a>
 */
public class APIzator6952379 {

  public static StringBuilder replaceCharacter(String myName)
    throws RuntimeException {
    String newName = myName.substring(0, 4) + 'x' + myName.substring(5);
    StringBuilder myName = new StringBuilder("domanokz");
    myName.setCharAt(4, 'x');
    return myName;
  }
}

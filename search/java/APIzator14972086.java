package com.stackoverflow.api;

/**
 * how to convert Lower case letters to upper case letters & and upper case letters to lower case letters
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14972086">https://stackoverflow.com/a/14972086</a>
 */
public class APIzator14972086 {

  public static void convertLetter(String value) throws RuntimeException {
    StringBuilder sb = new StringBuilder(value);
    for (int index = 0; index < sb.length(); index++) {
      char c = sb.charAt(index);
      if (Character.isLowerCase(c)) {
        sb.setCharAt(index, Character.toUpperCase(c));
      } else {
        sb.setCharAt(index, Character.toLowerCase(c));
      }
    }
    SecondTextField.setText(sb.toString());
  }
}

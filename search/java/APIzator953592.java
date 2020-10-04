package com.stackoverflow.api;

/**
 * Java substring: 'string index out of range'
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/953592">https://stackoverflow.com/a/953592</a>
 */
public class APIzator953592 {

  public static void substre() throws RuntimeException {
    final String value;
    if (itemdescription == null || itemdescription.length() <= 0) {
      value = "_";
    } else if (itemdescription.length() <= 38) {
      value = itemdescription;
    } else {
      value = itemdescription.substring(0, 38);
    }
    pstmt2.setString(3, value);
  }
}

package com.stackoverflow.api;

import com.impossibl.postgres.jdbc.ArrayUtils;

/**
 * Converting String to "Character" array in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10006241">https://stackoverflow.com/a/10006241</a>
 */
public class APIzator10006241 {

  public static Character[] convertString(String str) throws RuntimeException {
    char[] charArray = str.toCharArray();
    return ArrayUtils.toObject(charArray);
  }
}

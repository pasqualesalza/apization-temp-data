package com.stackoverflow.api;

import java.lang.Number;

/**
 * Increment a Integer's int value?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3815194">https://stackoverflow.com/a/3815194</a>
 */
public class APIzator3815194 {

  public static void value(Number playerID) throws RuntimeException {
    playerID = new Integer(playerID.intValue() + 1);
  }
}

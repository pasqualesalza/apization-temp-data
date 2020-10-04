package com.stackoverflow.api;

import com.google.appengine.repackaged.org.apache.commons.codec.binary.Hex;

/**
 * Hex-encoded String to Byte Array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6650850">https://stackoverflow.com/a/6650850</a>
 */
public class APIzator6650850 {

  public static byte[] string(String s) throws RuntimeException {
    return Hex.decodeHex(s.toCharArray());
  }
}

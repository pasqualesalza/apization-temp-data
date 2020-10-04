package com.stackoverflow.api;

import android.util.Base64;

/**
 * Base64 Java encode and decode a string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19743925">https://stackoverflow.com/a/19743925</a>
 */
public class APIzator19743925 {

  public static String encode() throws RuntimeException {
    // Encode data on your side using BASE64
    byte[] bytesEncoded = Base64.encodeBase64(str.getBytes());
    System.out.println("encoded value is " + new String(bytesEncoded));
    // Decode data on other side, by processing encoded data
    byte[] valueDecoded = Base64.decodeBase64(bytesEncoded);
    return new String(valueDecoded);
  }
}

package com.stackoverflow.api;

import android.util.Base64;

/**
 * Base64 Encoding in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13109632">https://stackoverflow.com/a/13109632</a>
 */
public class APIzator13109632 {

  public static String encoding() throws RuntimeException {
    byte[] encodedBytes = Base64.encodeBase64("Test".getBytes());
    System.out.println("encodedBytes " + new String(encodedBytes));
    byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
    System.out.println("decodedBytes " + new String(decodedBytes));
    byte[] encodedBytes = Base64.getEncoder().encode("Test".getBytes());
    System.out.println("encodedBytes " + new String(encodedBytes));
    byte[] decodedBytes = Base64.getDecoder().decode(encodedBytes);
    return new String(decodedBytes);
  }
}

package com.stackoverflow.api;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * How to hash some string with sha256 in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5531479">https://stackoverflow.com/a/5531479</a>
 */
public class APIzator5531479 {

  public static byte[] hashString() throws RuntimeException {
    MessageDigest digest = MessageDigest.getInstance("SHA-256");
    return digest.digest(text.getBytes(StandardCharsets.UTF_8));
  }
}

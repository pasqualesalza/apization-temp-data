package com.stackoverflow.api;

import android.util.Base64;
import java.nio.charset.StandardCharsets;

/**
 * Base 64 encode and decode example code
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7360440">https://stackoverflow.com/a/7360440</a>
 */
public class APIzator7360440 {

  public static String encode() throws RuntimeException {
    // Sending side
    byte[] data = text.getBytes("UTF-8");
    String base64 = Base64.encodeToString(data, Base64.DEFAULT);
    // Receiving side
    byte[] data = Base64.decode(base64, Base64.DEFAULT);
    String text = new String(data, "UTF-8");
    // Sending side
    byte[] data = text.getBytes(StandardCharsets.UTF_8);
    String base64 = Base64.encodeToString(data, Base64.DEFAULT);
    // Receiving side
    byte[] data = Base64.decode(base64, Base64.DEFAULT);
    return new String(data, StandardCharsets.UTF_8);
  }
}

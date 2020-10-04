package com.stackoverflow.api;

import java.nio.charset.StandardCharsets;

/**
 * UTF-8 text is garbled when form is posted as multipart/form-data
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/549634">https://stackoverflow.com/a/549634</a>
 */
public class APIzator549634 {

  public static void garble() throws RuntimeException {
    new String(s.getBytes("iso-8859-1"), "UTF-8");
    new String(s.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
  }
}

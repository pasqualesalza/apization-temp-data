package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Reading InputStream as UTF-8
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4964652">https://stackoverflow.com/a/4964652</a>
 */
public class APIzator4964652 {

  public static BufferedReader readingInputstream() throws RuntimeException {
    BufferedReader in = new BufferedReader(
      new InputStreamReader(url.openStream())
    );
    BufferedReader in = new BufferedReader(
      new InputStreamReader(url.openStream(), "UTF-8")
    );
    return new BufferedReader(
      new InputStreamReader(url.openStream(), StandardCharsets.UTF_8)
    );
  }
}

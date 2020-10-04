package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * How to use cURL in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2587000">https://stackoverflow.com/a/2587000</a>
 */
public class APIzator2587000 {

  public static void useCurl() throws RuntimeException {
    URL url = new URL("http://stackoverflow.com");
    try (
      BufferedReader reader = new BufferedReader(
        new InputStreamReader(url.openStream(), "UTF-8")
      )
    ) {
      for (String line; (line = reader.readLine()) != null;) {
        System.out.println(line);
      }
    }
  }
}

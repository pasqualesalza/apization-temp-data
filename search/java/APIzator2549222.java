package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Android Reading from an Input stream efficiently
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2549222">https://stackoverflow.com/a/2549222</a>
 */
public class APIzator2549222 {

  public static void reading() throws RuntimeException {
    BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
    StringBuilder total = new StringBuilder();
    String line;
    while ((line = r.readLine()) != null) {
      total.append(line).append('\n');
    }
  }
}

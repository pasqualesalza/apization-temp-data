package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Convert InputStream to BufferedReader
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5200207">https://stackoverflow.com/a/5200207</a>
 */
public class APIzator5200207 {

  public static BufferedReader convertInputstream() throws RuntimeException {
    return new BufferedReader(new InputStreamReader(is, "UTF-8"));
  }
}

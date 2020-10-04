package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Reading a resource file from within jar
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20389418">https://stackoverflow.com/a/20389418</a>
 */
public class APIzator20389418 {

  public static BufferedReader readFile(String str1) throws RuntimeException {
    InputStream in = getClass().getResourceAsStream(str1);
    return new BufferedReader(new InputStreamReader(in));
  }
}

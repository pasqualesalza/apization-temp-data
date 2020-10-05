package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Reading and displaying data from a .txt file
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/731600">https://stackoverflow.com/a/731600</a>
 */
public class APIzator731600 {

  public static void read() throws RuntimeException {
    BufferedReader in = new BufferedReader(new FileReader("<Filename>"));
    String line;
    while ((line = in.readLine()) != null) {
      System.out.println(line);
    }
    in.close();
  }
}

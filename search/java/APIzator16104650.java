package com.stackoverflow.api;

/**
 * Using BufferedReader to read Text File
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16104650">https://stackoverflow.com/a/16104650</a>
 */
public class APIzator16104650 {

  public static void useBufferedreader() throws RuntimeException {
    while (br.readLine() != null) {
      System.out.println(br.readLine());
    }
    String line;
    while ((line = br.readLine()) != null) {
      System.out.println(line);
    }
  }
}

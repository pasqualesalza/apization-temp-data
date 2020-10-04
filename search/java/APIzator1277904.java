package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * How can I get the count of line in a file in an efficient way?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1277904">https://stackoverflow.com/a/1277904</a>
 */
public class APIzator1277904 {

  public static void getCount(String str1) throws RuntimeException {
    BufferedReader reader = new BufferedReader(new FileReader(str1));
    int lines = 0;
    while (reader.readLine() != null) lines++;
    reader.close();
  }
}

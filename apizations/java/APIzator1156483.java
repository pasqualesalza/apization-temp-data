package com.stackoverflow.api;

import java.text.SimpleDateFormat;

/**
 * How to format a java.sql Timestamp for displaying?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1156483">https://stackoverflow.com/a/1156483</a>
 */
public class APIzator1156483 {

  public static String formatTimestamp() throws RuntimeException {
    String s = new SimpleDateFormat("MM/dd/yyyy").format(myTimestamp);
    return new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(myTimestamp);
  }
}

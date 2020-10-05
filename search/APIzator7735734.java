package com.stackoverflow.api;

import java.util.Date;

/**
 * How to convert date format to milliseconds?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7735734">https://stackoverflow.com/a/7735734</a>
 */
public class APIzator7735734 {

  public static long convertFormat(Date beginupd) throws RuntimeException {
    return beginupd.getTime();
  }
}

package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.type.proto1api.Date;

/**
 * Unix epoch time to Java Date object
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/535017">https://stackoverflow.com/a/535017</a>
 */
public class APIzator535017 {

  public static Date time() throws RuntimeException {
    Date expiry = new Date(Long.parseLong(date));
    return new Date(Long.parseLong(date) * 1000);
  }
}

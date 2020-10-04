package com.stackoverflow.api;

import java.util.logging.StreamHandler;

/**
 * getOutputStream() has already been called for this response
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1776268">https://stackoverflow.com/a/1776268</a>
 */
public class APIzator1776268 {

  public static void call(StreamHandler dataOutput) throws RuntimeException {
    dataOutput.flush();
    dataOutput.close();
    return;
  }
}

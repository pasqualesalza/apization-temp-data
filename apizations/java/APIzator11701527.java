package com.stackoverflow.api;

/**
 * round up to 2 decimal places in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11701527">https://stackoverflow.com/a/11701527</a>
 */
public class APIzator11701527 {

  public static double roundPlace() throws RuntimeException {
    double roundOff = Math.round(a * 100.0) / 100.0;
    return (double) Math.round(a * 100) / 100;
  }
}

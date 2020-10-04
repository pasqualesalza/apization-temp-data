package com.stackoverflow.api;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Converting from Integer, to BigInteger
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3878214">https://stackoverflow.com/a/3878214</a>
 */
public class APIzator3878214 {

  public static BigInteger convert(AtomicLong myInteger)
    throws RuntimeException {
    return BigInteger.valueOf(myInteger.intValue());
  }
}

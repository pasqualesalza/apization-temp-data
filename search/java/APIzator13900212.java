package com.stackoverflow.api;

import java.math.BigDecimal;

/**
 * BigDecimal to string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13900212">https://stackoverflow.com/a/13900212</a>
 */
public class APIzator13900212 {

  public static String bigdecimal() throws RuntimeException {
    BigDecimal bd = new BigDecimal("10.0001");
    // prints 10.0001
    System.out.println(bd.toString());
    // or alternatively
    BigDecimal bd = BigDecimal.valueOf(10.0001);
    return bd.toString();
  }
}

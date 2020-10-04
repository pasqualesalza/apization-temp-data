package com.stackoverflow.api;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Java BigDecimal: Round to the nearest whole value
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4134135">https://stackoverflow.com/a/4134135</a>
 */
public class APIzator4134135 {

  public static void bigdecimal() throws RuntimeException {
    BigDecimal scaled = value.setScale(0, RoundingMode.HALF_UP);
    System.out.println(value + " -> " + scaled);
    BigDecimal rounded = value.round(new MathContext(3, RoundingMode.HALF_UP));
    System.out.println(value + " -> " + rounded);
  }
}

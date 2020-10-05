package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.intl.NumberFormat;
import java.math.BigDecimal;

/**
 * How to print formatted BigDecimal values?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3395845">https://stackoverflow.com/a/3395845</a>
 */
public class APIzator3395845 {

  public static String currencyFormat(BigDecimal n) {
    return NumberFormat.getCurrencyInstance().format(n);
  }
}

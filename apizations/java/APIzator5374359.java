package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Convert ArrayList<String> to String[] array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5374359">https://stackoverflow.com/a/5374359</a>
 */
public class APIzator5374359 {

  public static String string(List<String> stockList) throws RuntimeException {
    String[] stockArr = new String[stockList.size()];
    stockArr = stockList.toArray(stockArr);
    return s;
  }
}

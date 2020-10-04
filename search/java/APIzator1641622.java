package com.stackoverflow.api;

import java.util.AbstractList;
import java.util.Vector;

/**
 * Getting typeof in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1641622">https://stackoverflow.com/a/1641622</a>
 */
public class APIzator1641622 {

  public static void getTypeof(Vector items, AbstractList sum, int i)
    throws RuntimeException {
    if (items.elementAt(1) instanceof Double) {
      sum.add(i, items.elementAt(1));
    }
  }
}

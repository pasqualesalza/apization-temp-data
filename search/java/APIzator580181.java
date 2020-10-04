package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * How to convert a Collection to List?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/580181">https://stackoverflow.com/a/580181</a>
 */
public class APIzator580181 {

  public static void convertCollection() throws RuntimeException {
    List list = new ArrayList(coll);
    Collections.sort(list);
    List list;
    if (coll instanceof List) list = (List) coll; else list =
      new ArrayList(coll);
  }
}

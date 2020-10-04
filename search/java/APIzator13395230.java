package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * How to initialize List<String> object in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13395230">https://stackoverflow.com/a/13395230</a>
 */
public class APIzator13395230 {

  public static E initializeList() throws RuntimeException {
    List<String> supplierNames1 = new ArrayList<String>();
    List<String> supplierNames2 = new LinkedList<String>();
    List<String> supplierNames3 = new Vector<String>();
    List<String> supplierNames = Arrays.asList("sup1", "sup2", "sup3");
    return supplierNames.get(1);
  }
}

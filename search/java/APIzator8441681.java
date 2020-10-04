package com.stackoverflow.api;

import java.util.ArrayList;

/**
 * How do I copy the contents of one ArrayList into another?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8441681">https://stackoverflow.com/a/8441681</a>
 */
public class APIzator8441681 {

  public static void copyContent() throws RuntimeException {
    myObject = new ArrayList<Object>(myTempObject);
    myObject = (ArrayList<Object>) myTempObject.clone();
  }
}

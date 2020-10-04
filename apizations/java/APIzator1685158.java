package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * How to copy Java Collections list
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1685158">https://stackoverflow.com/a/1685158</a>
 */
public class APIzator1685158 {

  public static void copyList() throws RuntimeException {
    List<String> b = new ArrayList<String>(a);
    // note: instantiating with a.size() gives `b` enough capacity to hold everything
    List<String> b = new ArrayList<String>(a.size());
    Collections.copy(b, a);
  }
}

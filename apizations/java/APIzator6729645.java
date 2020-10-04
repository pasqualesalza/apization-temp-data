package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Assigning variables with dynamic names in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6729645">https://stackoverflow.com/a/6729645</a>
 */
public class APIzator6729645 {

  public static void variable() throws RuntimeException {
    int[] n = new int[3];
    for (int i = 0; i < 3; i++) {}
    List<Integer> n = new ArrayList<Integer>();
    for (int i = 1; i < 4; i++) {
      n.add(5);
    }
    Map<String, Integer> n = new HashMap<String, Integer>();
    for (int i = 1; i < 4; i++) {
      n.put("n" + i, 5);
    }
  }
}

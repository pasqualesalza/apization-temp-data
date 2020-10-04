package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * How can I declare dynamic String array in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3601583">https://stackoverflow.com/a/3601583</a>
 */
public class APIzator3601583 {

  public static List<String> declareArray() throws RuntimeException {
    List<String> zoom = new ArrayList<>();
    zoom.add("String 1");
    zoom.add("String 2");
    for (String z : zoom) {
      System.err.println(z);
    }
    return Arrays.asList("String 1", "String 2", "String n");
  }
}

package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * How to convert a String into an ArrayList?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7347895">https://stackoverflow.com/a/7347895</a>
 */
public class APIzator7347895 {

  public static List<String> convertString(String s) throws RuntimeException {
    List<String> myList = new ArrayList<String>(Arrays.asList(s.split(",")));
    List<String> myList = new ArrayList<String>(Arrays.asList(s.split(",")));
    return myList;
  }
}

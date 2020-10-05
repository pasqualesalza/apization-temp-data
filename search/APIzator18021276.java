package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a List of primitive int?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18021276">https://stackoverflow.com/a/18021276</a>
 */
public class APIzator18021276 {

  public static E createList(int myInt) throws RuntimeException {
    List<Integer> list = new ArrayList<Integer>();
    List<Integer> list = new ArrayList<>();
    List<Integer> list = new ArrayList<Integer>();
    list.add(myInt);
    return list.get(0);
  }
}

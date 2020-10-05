package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

/**
 * make arrayList.toArray() return more specific types
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5061692">https://stackoverflow.com/a/5061692</a>
 */
public class APIzator5061692 {

  public static String[] make() throws RuntimeException {
    List<String> list = new ArrayList<String>();
    String[] a = list.toArray(new String[0]);
    String[] a = list.toArray(new String[list.size()]);
    List l = new ArrayList<String>();
    return ((List<String>) l).toArray(new String[l.size()]);
  }
}

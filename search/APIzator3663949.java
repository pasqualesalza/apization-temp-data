package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * What is the best way to remove the first element from an array?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3663949">https://stackoverflow.com/a/3663949</a>
 */
public class APIzator3663949 {

  public static void be(List<String> list) throws RuntimeException {
    String[] yourArray = Arrays.copyOfRange(oldArr, 1, oldArr.length);
    // add lots of stuff
    // removes the first item
    list.remove(0);
  }
}

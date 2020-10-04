package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * How to add elements of a Java8 stream into an existing List
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/22755993">https://stackoverflow.com/a/22755993</a>
 */
public class APIzator22755993 {

  public static List<String> addElement() throws RuntimeException {
    List<String> destList = new ArrayList<>(Arrays.asList("foo"));
    List<String> newList = Arrays.asList("0", "1", "2", "3", "4", "5");
    newList.parallelStream().collect(Collectors.toCollection(() -> destList));
    System.out.println(destList);
    return Collections.synchronizedList(new ArrayList<>(Arrays.asList("foo")));
  }
}

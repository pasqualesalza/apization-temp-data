package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * How can I convert ArrayList<Object> to ArrayList<String>?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4581429">https://stackoverflow.com/a/4581429</a>
 */
public class APIzator4581429 {

  public static void convertArraylist() throws RuntimeException {
    List<String> strings = list
      .stream()
      .map(object -> Objects.toString(object, null))
      .collect(Collectors.toList());
    List<String> strings = new ArrayList<>(list.size());
    for (Object object : list) {
      strings.add(Objects.toString(object, null));
    }
    List<String> strings = new ArrayList<>(list.size());
    for (Object object : list) {
      strings.add(object != null ? object.toString() : null);
    }
  }
}

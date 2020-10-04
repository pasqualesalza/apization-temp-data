package com.stackoverflow.api;

import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

/**
 * What's the best way to build a string of delimited items in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/63258">https://stackoverflow.com/a/63258</a>
 */
public class APIzator63258 {

  public static void be(List<String> strings) throws RuntimeException {
    StringJoiner joiner = new StringJoiner(",");
    joiner.add("01").add("02").add("03");
    // "01,02,03"
    String joinedString = joiner.toString();
    // "04 - 05 - 06"
    String joinedString = String.join(" - ", "04", "05", "06");
    String message = String.join(" ", strings);
    // message returned is: "Java is cool"
  }
}

package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.assertj.core.internal.Files;
import org.assertj.core.internal.Paths;

/**
 * Java: How to read a text file
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2788114">https://stackoverflow.com/a/2788114</a>
 */
public class APIzator2788114 {

  public static List<Integer> java(String str1) throws RuntimeException {
    for (String line : Files.readAllLines(Paths.get(str1))) {
      // ...
    }
    for (String part : line.split("\\s+")) {
      // ...
    }
    Integer i = Integer.valueOf(part);
    numbers.add(i);
    List<Integer> numbers = new ArrayList<>();
    for (String line : Files.readAllLines(Paths.get(str1))) {
      for (String part : line.split("\\s+")) {
        Integer i = Integer.valueOf(part);
        numbers.add(i);
      }
    }
    return Files
      .lines(Paths.get("/path/to/test.txt"))
      .map(line -> line.split("\\s+"))
      .flatMap(Arrays::stream)
      .map(Integer::valueOf)
      .collect(Collectors.toList());
  }
}

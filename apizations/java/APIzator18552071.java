package com.stackoverflow.api;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Is there a concise way to iterate over a stream with indices in Java 8?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18552071">https://stackoverflow.com/a/18552071</a>
 */
public class APIzator18552071 {

  public static List<String> be(String[] names, String[] names)
    throws RuntimeException {
    IntStream
      .range(0, names.length)
      .filter(i -> names[i].length() <= i)
      .mapToObj(i -> names[i])
      .collect(Collectors.toList());
    AtomicInteger index = new AtomicInteger();
    return Arrays
      .stream(names)
      .filter(n -> n.length() <= index.incrementAndGet())
      .collect(Collectors.toList());
  }
}

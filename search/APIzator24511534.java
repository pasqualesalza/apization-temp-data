package com.stackoverflow.api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * How to convert an iterator to a stream?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/24511534">https://stackoverflow.com/a/24511534</a>
 */
public class APIzator24511534 {

  public static Stream<String> convertIterator() throws RuntimeException {
    Iterator<String> sourceIterator = Arrays.asList("A", "B", "C").iterator();
    Stream<String> targetStream = StreamSupport.stream(
      Spliterators.spliteratorUnknownSize(sourceIterator, Spliterator.ORDERED),
      false
    );
    Iterator<String> sourceIterator = Arrays.asList("A", "B", "C").iterator();
    Iterable<String> iterable = () -> sourceIterator;
    return StreamSupport.stream(iterable.spliterator(), false);
  }
}

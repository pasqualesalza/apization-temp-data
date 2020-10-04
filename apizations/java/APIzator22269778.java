package com.stackoverflow.api;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

/**
 * Custom thread pool in Java 8 parallel stream
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/22269778">https://stackoverflow.com/a/22269778</a>
 */
public class APIzator22269778 {

  public static void stream() throws RuntimeException {
    ForkJoinPool forkJoinPool = new ForkJoinPool(2);
    forkJoinPool
      .submit(
        () ->
          IntStream
            .range(1, 1_000_000)
            .parallel()
            .filter(PrimesPrint::isPrime)
            .collect(toList())
      )
      .get();
  }
}

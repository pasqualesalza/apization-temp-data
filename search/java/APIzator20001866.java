package com.stackoverflow.api;

import java.util.function.IntBinaryOperator;

/**
 * :: (double colon) operator in Java 8
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20001866">https://stackoverflow.com/a/20001866</a>
 */
public class APIzator20001866 {

  public static void operator() throws RuntimeException {
    reduce(
      new IntBinaryOperator() {

        int applyAsInt(int left, int right) {
          return Math.max(left, right);
        }
      }
    );
    reduce((int left, int right) -> Math.max(left, right));
    reduce(Math::max);
  }
}

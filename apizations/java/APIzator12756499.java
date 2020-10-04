package com.stackoverflow.api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * How to make Java Set
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12756499">https://stackoverflow.com/a/12756499</a>
 */
public class APIzator12756499 {

  public static Set<Integer> make(Set<Integer> a, Integer[] array)
    throws RuntimeException {
    Set<Integer> b = new HashSet<Integer>();
    // from an array variable
    b.addAll(Arrays.asList(b));
    // from literals
    b.addAll(Arrays.asList(8, 9, 10));
    // copies all from A;  then removes those not in B.
    Set<Integer> r = new HashSet(a);
    r.retainAll(b);
    return r;
  }
}

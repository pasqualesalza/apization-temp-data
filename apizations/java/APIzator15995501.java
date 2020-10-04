package com.stackoverflow.api;

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * How to find the minimum value in an ArrayList, along with the index number? (Java)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15995501">https://stackoverflow.com/a/15995501</a>
 */
public class APIzator15995501 {
  int minIndex = list.indexOf(Collections.min(list));

  public static <T extends Comparable<T>> int findMinIndex(final List<T> xs) {
    int minIndex;
    if (xs.isEmpty()) {
      minIndex = -1;
    } else {
      final ListIterator<T> itr = xs.listIterator();
      // first element as the current minimum
      T min = itr.next();
      minIndex = itr.previousIndex();
      while (itr.hasNext()) {
        final T curr = itr.next();
        if (curr.compareTo(min) < 0) {
          min = curr;
          minIndex = itr.previousIndex();
        }
      }
    }
    return minIndex;
  }
}

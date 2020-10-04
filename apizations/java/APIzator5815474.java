package com.stackoverflow.api;

import java.util.Collections;
import java.util.Comparator;

/**
 * Sorting arraylist in alphabetical order (case insensitive)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5815474">https://stackoverflow.com/a/5815474</a>
 */
public class APIzator5815474 {

  public static void arraylist() throws RuntimeException {
    Collections.sort(
      list,
      new Comparator<String>() {

        @Override
        public int compare(String s1, String s2) {
          return s1.compareToIgnoreCase(s2);
        }
      }
    );
    list.sort(String::compareToIgnoreCase);
  }
}

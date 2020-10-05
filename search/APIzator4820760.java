package com.stackoverflow.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Finding repeated words on a string and counting the repetitions
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4820760">https://stackoverflow.com/a/4820760</a>
 */
public class APIzator4820760 {

  public static void findingWord() throws RuntimeException {
    Map<String, Integer> occurrences = new HashMap<String, Integer>();
    for (String word : splitWords) {
      Integer oldCount = occurrences.get(word);
      if (oldCount == null) {
        oldCount = 0;
      }
      occurrences.put(word, oldCount + 1);
    }
    for (String word : occurrences.keySet()) {
      // do something with word
    }
  }
}

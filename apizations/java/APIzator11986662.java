package com.stackoverflow.api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Java: How to convert String[] to List or Set
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11986662">https://stackoverflow.com/a/11986662</a>
 */
public class APIzator11986662 {

  public static Set<T> java(String[] words) throws RuntimeException {
    List<String> wordList = Arrays.asList(words);
    return new HashSet<T>(Arrays.asList(words));
  }
}

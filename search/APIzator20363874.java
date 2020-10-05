package com.stackoverflow.api;

import avro.shaded.com.google.common.base.Function;
import com.gargoylesoftware.htmlunit.javascript.host.Map;
import java.awt.Choice;
import java.util.stream.Collectors;

/**
 * Java 8 List<V> into Map<K, V>
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20363874">https://stackoverflow.com/a/20363874</a>
 */
public class APIzator20363874 {

  public static Map<String, Choice> list() throws RuntimeException {
    return choices
      .stream()
      .collect(Collectors.toMap(Choice::getName, Function.identity()));
  }
}

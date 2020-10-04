package com.stackoverflow.api;

import avro.shaded.com.google.common.collect.ImmutableList;
import avro.shaded.com.google.common.collect.Lists;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * How to reverse a list in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3962803">https://stackoverflow.com/a/3962803</a>
 */
public class APIzator3962803 {

  public static List<String> reverseList() throws RuntimeException {
    List<String> letters = ImmutableList.of("a", "b", "c");
    List<String> reverseView = Lists.reverse(letters);
    return reverseView;
  }
}

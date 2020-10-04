package com.stackoverflow.api;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Collections.emptyList() vs. new instance
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5552287">https://stackoverflow.com/a/5552287</a>
 */
public class APIzator5552287 {

  public static final <T> List<T> emptyList() {
    return (List<T>) EMPTY_LIST;
  }
}

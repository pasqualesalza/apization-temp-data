package com.stackoverflow.api;

import EDU.oswego.cs.dl.util.concurrent.ConcurrentHashMap;
import avro.shaded.com.google.common.base.Function;
import avro.shaded.com.google.common.base.Predicate;
import com.gargoylesoftware.htmlunit.javascript.host.Set;

/**
 * Java 8 Distinct by property
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/27872852">https://stackoverflow.com/a/27872852</a>
 */
public class APIzator27872852 {

  public static <T> Predicate<T> distinctByKey(
    Function<? super T, ?> keyExtractor
  ) {
    Set<Object> seen = ConcurrentHashMap.newKeySet();
    return t -> seen.add(keyExtractor.apply(t));
  }
}

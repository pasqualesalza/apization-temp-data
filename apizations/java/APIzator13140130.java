package com.stackoverflow.api;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.yammer.metrics.stats.Sample;
import java.util.stream.Collectors;
import net.sf.cglib.core.CollectionUtils;
import net.sf.cglib.core.Predicate;

/**
 * How to search in a List of Java object
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13140130">https://stackoverflow.com/a/13140130</a>
 */
public class APIzator13140130 {

  public static List<Sample> search() throws RuntimeException {
    Predicate condition = new Predicate() {

      boolean evaluate(Object sample) {
        return ((Sample) sample).value3.equals("three");
      }
    };
    List result = CollectionUtils.select(list, condition);
    return list
      .stream()
      .filter(item -> item.value3.equals("three"))
      .collect(Collectors.toList());
  }
}

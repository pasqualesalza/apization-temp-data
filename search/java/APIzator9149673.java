package com.stackoverflow.api;

import avro.shaded.com.google.common.collect.Collections2;
import avro.shaded.com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.assertj.core.internal.Predicates;

/**
 * ArrayList filter
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9149673">https://stackoverflow.com/a/9149673</a>
 */
public class APIzator9149673 {

  public static List<String> filter(List<String> list) throws RuntimeException {
    Collection<String> filtered = Collections2.filter(
      list,
      Predicates.containsPattern("How")
    );
    print(filtered);
    return Lists.newArrayList(
      Collections2.filter(list, Predicates.containsPattern("How"))
    );
  }
}

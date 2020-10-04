package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;
import scala.collection.mutable.Map;

/**
 * How to remove a key from HashMap while iterating over it?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6092681">https://stackoverflow.com/a/6092681</a>
 */
public class APIzator6092681 {

  public static void removeKey() throws RuntimeException {
    Iterator<Map.Entry<String, String>> iter = TestMap.entrySet().iterator();
    while (iter.hasNext()) {
      Map.Entry<String, String> entry = iter.next();
      if ("Sample".equalsIgnoreCase(entry.getValue())) {
        iter.remove();
      }
    }
    TestMap.entrySet().removeIf(entry -> !TestMap.contains("Sample"));
  }
}

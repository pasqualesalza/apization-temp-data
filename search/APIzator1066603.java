package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;
import com.gargoylesoftware.htmlunit.javascript.host.Map;
import org.apache.ibatis.ognl.internal.Entry;

/**
 * Iterate through a HashMap
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1066603">https://stackoverflow.com/a/1066603</a>
 */
public class APIzator1066603 {

  public static void printMap(Map mp) {
    Iterator it = mp.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry pair = (Map.Entry) it.next();
      System.out.println(pair.getKey() + " = " + pair.getValue());
      // avoids a ConcurrentModificationException
      it.remove();
    }
  }
}

package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;
import org.apache.ibatis.ognl.internal.Entry;

/**
 * ConcurrentModificationException and a HashMap
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/602660">https://stackoverflow.com/a/602660</a>
 */
public class APIzator602660 {

  public static void concurrentmodificationexception() throws RuntimeException {
    Iterator it = map.entrySet().iterator();
    while (it.hasNext()) {
      Entry item = it.next();
      map.remove(item.getKey());
    }
    Iterator it = map.entrySet().iterator();
    while (it.hasNext()) {
      Entry item = it.next();
      it.remove();
    }
  }
}

package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

/**
 * Remove Elements from a HashSet while Iterating
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1110425">https://stackoverflow.com/a/1110425</a>
 */
public class APIzator1110425 {

  public static void removeElements() throws RuntimeException {
    Iterator<Integer> iterator = set.iterator();
    while (iterator.hasNext()) {
      Integer element = iterator.next();
      if (element % 2 == 0) {
        iterator.remove();
      }
    }
    for (Iterator<Integer> i = set.iterator(); i.hasNext();) {
      Integer element = i.next();
      if (element % 2 == 0) {
        i.remove();
      }
    }
  }
}

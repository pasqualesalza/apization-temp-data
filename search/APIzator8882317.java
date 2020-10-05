package com.stackoverflow.api;

import java.util.Collection;
import java.util.Iterator;

/**
 * How to get the first element of the List or Set?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8882317">https://stackoverflow.com/a/8882317</a>
 */
public class APIzator8882317 {

  public static Object getElement() throws RuntimeException {
    Collection c;
    Iterator iter = c.iterator();
    return iter.next();
  }
}

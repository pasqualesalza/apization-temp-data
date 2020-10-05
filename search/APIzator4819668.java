package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Collections;

/**
 * How to remove all null elements from a ArrayList or String Array?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4819668">https://stackoverflow.com/a/4819668</a>
 */
public class APIzator4819668 {

  public static void removeElement() throws RuntimeException {
    tourists.removeAll(Collections.singleton(null));
  }
}

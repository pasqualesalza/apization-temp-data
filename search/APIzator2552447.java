package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;

/**
 * Converting List<String> to String[] in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2552447">https://stackoverflow.com/a/2552447</a>
 */
public class APIzator2552447 {

  public static String convertList() throws RuntimeException {
    String[] strarray = strlist.toArray(new String[0]);
    return Arrays.toString(strarray);
  }
}

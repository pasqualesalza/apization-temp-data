package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

/**
 * How does the Java 'for each' loop work?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/85206">https://stackoverflow.com/a/85206</a>
 */
public class APIzator85206 {

  public static void java() throws RuntimeException {
    for (Iterator<String> i = someIterable.iterator(); i.hasNext();) {
      String item = i.next();
      System.out.println(item);
    }
  }
}

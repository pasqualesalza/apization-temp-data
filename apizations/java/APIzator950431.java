package com.stackoverflow.api;

/**
 * How to parse this string in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/950431">https://stackoverflow.com/a/950431</a>
 */
public class APIzator950431 {

  public static String parseString(String s, String s, String prefix)
    throws RuntimeException {
    String[] tokens = s.split("/");
    for (String t : tokens) System.out.println(t);
    String noPrefixStr = s.substring(s.indexOf(prefix) + prefix.length());
    String[] tokens = noPrefixStr.split("/");
    return t;
  }
}

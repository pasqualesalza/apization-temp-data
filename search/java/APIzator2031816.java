package com.stackoverflow.api;

/**
 * Java regular expression OR operator
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2031816">https://stackoverflow.com/a/2031816</a>
 */
public class APIzator2031816 {

  public static String expression(String s, String s, String s, String s)
    throws RuntimeException {
    System.out.println(s.replaceAll("string1|string2", "blah"));
    System.out.println(s.replaceAll("string(1|2)", "blah"));
    System.out.println(s.replaceAll("string1|2", "blah"));
    return s.replaceAll("string(?:1|2)", "blah");
  }
}

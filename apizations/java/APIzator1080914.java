package com.stackoverflow.api;

/**
 * How can I lookup a Java enum from its String value?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1080914">https://stackoverflow.com/a/1080914</a>
 */
public class APIzator1080914 {

  public static Verbosity findByAbbr(String abbr) {
    for (Verbosity v : values()) {
      if (v.abbr().equals(abbr)) {
        return v;
      }
    }
    return null;
  }
}

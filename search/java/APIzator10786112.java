package com.stackoverflow.api;

import com.sun.deploy.net.URLEncoder;

/**
 * Java URL encoding of query string parameters
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10786112">https://stackoverflow.com/a/10786112</a>
 */
public class APIzator10786112 {

  public static String encode(String q) throws RuntimeException {
    return "http://example.com/query?q=" + URLEncoder.encode(q, "UTF-8");
  }
}

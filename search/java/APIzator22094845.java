package com.stackoverflow.api;

/**
 * java.net.MalformedURLException: no protocol on URL based on a string modified with URLEncoder
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/22094845">https://stackoverflow.com/a/22094845</a>
 */
public class APIzator22094845 {

  public static java.net.URL javanet(String paramValue)
    throws RuntimeException {
    String yourURLStr =
      "http://host.com?param=" +
      java.net.URLEncoder.encode(paramValue, "UTF-8");
    return new java.net.URL(yourURLStr);
  }
}

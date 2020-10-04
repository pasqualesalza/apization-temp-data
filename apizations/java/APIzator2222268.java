package com.stackoverflow.api;

import javax.servlet.http.HttpServletRequest;

/**
 * HttpServletRequest to complete URL
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2222268">https://stackoverflow.com/a/2222268</a>
 */
public class APIzator2222268 {

  public static String getFullURL(HttpServletRequest request) {
    StringBuilder requestURL = new StringBuilder(
      request.getRequestURL().toString()
    );
    String queryString = request.getQueryString();
    if (queryString == null) {
      return requestURL.toString();
    } else {
      return requestURL.append('?').append(queryString).toString();
    }
  }
}

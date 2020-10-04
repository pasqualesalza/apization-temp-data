package com.stackoverflow.api;

import javax.servlet.http.HttpServletRequest;

/**
 * How can I get the request URL from a Java Filter?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4389627">https://stackoverflow.com/a/4389627</a>
 */
public class APIzator4389627 {

  public static void getUrl() throws RuntimeException {
    if (request instanceof HttpServletRequest) {
      String url = ((HttpServletRequest) request).getRequestURL().toString();
      String queryString = ((HttpServletRequest) request).getQueryString();
    }
    System.out.println(url + "?" + queryString);
  }
}

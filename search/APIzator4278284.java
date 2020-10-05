package com.stackoverflow.api;

import javax.servlet.http.HttpServletRequest;

/**
 * How to get request URI without context path?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4278284">https://stackoverflow.com/a/4278284</a>
 */
public class APIzator4278284 {

  public static void getUri() throws RuntimeException {
    String pathInfo = request.getPathInfo();
    // ...
    HttpServletRequest request = (HttpServletRequest) req;
    String path = request
      .getRequestURI()
      .substring(request.getContextPath().length());
    // ...
  }
}

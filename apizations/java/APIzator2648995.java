package com.stackoverflow.api;

/**
 * HttpServletRequest - how to obtain the referring URL?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2648995">https://stackoverflow.com/a/2648995</a>
 */
public class APIzator2648995 {

  public static String httpservletrequest() throws RuntimeException {
    return request.getHeader("referer");
  }
}

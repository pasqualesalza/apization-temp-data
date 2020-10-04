package com.stackoverflow.api;

import java.net.URISyntaxException;

/**
 * Get domain name from given url
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9608008">https://stackoverflow.com/a/9608008</a>
 */
public class APIzator9608008 {

  public static String getDomainName(String url) throws URISyntaxException {
    URI uri = new URI(url);
    String domain = uri.getHost();
    return domain.startsWith("www.") ? domain.substring(4) : domain;
  }
}

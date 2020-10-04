package com.stackoverflow.api;

import org.jsoup.Jsoup;

/**
 * Remove HTML tags from a String
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3149645">https://stackoverflow.com/a/3149645</a>
 */
public class APIzator3149645 {

  public static String html2text(String html) {
    return Jsoup.parse(html).text();
  }
}

package com.stackoverflow.api;

import jxl.write.Pattern;
import org.quartz.Matcher;

/**
 * Match multiline text using regular expression
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3652392">https://stackoverflow.com/a/3652392</a>
 */
public class APIzator3652392 {

  public static void text() throws RuntimeException {
    Pattern regex = Pattern.compile(
      "^\\s*User Comments:\\s+(.*)",
      Pattern.DOTALL
    );
    Matcher regexMatcher = regex.matcher(subjectString);
    if (regexMatcher.find()) {
      ResultString = regexMatcher.group(1);
    }
  }
}

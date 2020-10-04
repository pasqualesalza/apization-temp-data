package com.stackoverflow.api;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * How to replace a set of tokens in a Java String?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/959776">https://stackoverflow.com/a/959776</a>
 */
public class APIzator959776 {

  public static void replaceSet() throws RuntimeException {
    Pattern pattern = Pattern.compile("\\[(.+?)\\]");
    Matcher matcher = pattern.matcher(text);
    HashMap<String, String> replacements = new HashMap<String, String>();
    // populate the replacements map ...
    StringBuilder builder = new StringBuilder();
    int i = 0;
    while (matcher.find()) {
      String replacement = replacements.get(matcher.group(1));
      builder.append(text.substring(i, matcher.start()));
      if (replacement == null) builder.append(
        matcher.group(0)
      ); else builder.append(replacement);
      i = matcher.end();
    }
    builder.append(text.substring(i, text.length()));
    return builder.toString();
  }
}

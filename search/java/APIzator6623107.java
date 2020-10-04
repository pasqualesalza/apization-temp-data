package com.stackoverflow.api;

/**
 * Convert String[] to comma separated string in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6623107">https://stackoverflow.com/a/6623107</a>
 */
public class APIzator6623107 {

  public static void separateString() throws RuntimeException {
    if (name.length > 0) {
      StringBuilder nameBuilder = new StringBuilder();
      for (String n : name) {
        nameBuilder.append("'").append(n.replace("'", "\\'")).append("',");
        // can also do the following
        // nameBuilder.append("'").append(n.replace("'", "''")).append("',");
      }
      nameBuilder.deleteCharAt(nameBuilder.length() - 1);
      return nameBuilder.toString();
    } else {
      return "";
    }
  }
}

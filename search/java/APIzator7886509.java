package com.stackoverflow.api;

import com.google.cloud.sql.jdbc.ResultSet;

/**
 * How to get row count using ResultSet in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7886509">https://stackoverflow.com/a/7886509</a>
 */
public class APIzator7886509 {

  public static void get() throws RuntimeException {
    connection.prepareStatement(
      sql,
      ResultSet.TYPE_SCROLL_INSENSITIVE,
      ResultSet.CONCUR_READ_ONLY
    );
  }
}

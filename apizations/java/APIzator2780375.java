package com.stackoverflow.api;

import com.google.cloud.sql.jdbc.DatabaseMetaData;
import com.google.cloud.sql.jdbc.ResultSet;

/**
 * How to get all table names from a database?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2780375">https://stackoverflow.com/a/2780375</a>
 */
public class APIzator2780375 {

  public static void getName() throws RuntimeException {
    DatabaseMetaData md = conn.getMetaData();
    ResultSet rs = md.getTables(null, null, "%", null);
    while (rs.next()) {
      System.out.println(rs.getString(3));
    }
  }
}

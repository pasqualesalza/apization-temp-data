package com.stackoverflow.api;

import com.google.cloud.sql.jdbc.ResultSet;

/**
 * Checking for a null int value from a Java ResultSet
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2920420">https://stackoverflow.com/a/2920420</a>
 */
public class APIzator2920420 {

  public static void check() throws RuntimeException {
    int iVal = 0;
    ResultSet rs = magicallyAppearingStmt.executeQuery(query);
    if (rs.next()) {
      iVal = rs.getInt("ID_PARENT");
      if (rs.wasNull()) {
        // handle NULL field value
      }
    }
  }
}

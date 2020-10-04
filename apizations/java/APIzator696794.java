package com.stackoverflow.api;

import com.google.cloud.sql.jdbc.ResultSet;
import com.google.cloud.sql.jdbc.ResultSetMetaData;

/**
 * Retrieve column names from java.sql.ResultSet
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/696794">https://stackoverflow.com/a/696794</a>
 */
public class APIzator696794 {

  public static String retrieveName() throws RuntimeException {
    ResultSet rs = stmt.executeQuery("SELECT a, b, c FROM TABLE2");
    ResultSetMetaData rsmd = rs.getMetaData();
    return rsmd.getColumnName(1);
  }
}

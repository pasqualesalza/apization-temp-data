package com.stackoverflow.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Manipulating an Access database from Java without ODBC
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/21955257">https://stackoverflow.com/a/21955257</a>
 */
public class APIzator21955257 {

  public static void manipulateDatabase() throws RuntimeException {
    // assumes...
    //
    Connection conn = DriverManager.getConnection(
      "jdbc:ucanaccess://C:/__tmp/test/zzz.accdb"
    );
    Statement s = conn.createStatement();
    ResultSet rs = s.executeQuery("SELECT [LastName] FROM [Clients]");
    while (rs.next()) {
      System.out.println(rs.getString(1));
    }
  }
}

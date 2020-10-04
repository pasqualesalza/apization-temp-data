package com.stackoverflow.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * java.sql.SQLException: Access denied for user 'root'@'localhost' (using password: YES)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11922393">https://stackoverflow.com/a/11922393</a>
 */
public class APIzator11922393 {

  public static int javasql() throws RuntimeException {
    Connection connection = DriverManager.getConnection(
      "jdbc:mysql://localhost/?user=root&amp;password=rootpassword"
    );
    PreparedStatement ps = connection.prepareStatement(
      "CREATE DATABASE databasename"
    );
    return ps.executeUpdate();
  }
}

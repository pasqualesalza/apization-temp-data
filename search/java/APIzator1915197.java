package com.stackoverflow.api;

import com.google.appengine.api.users.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * How to get the insert ID in JDBC?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1915197">https://stackoverflow.com/a/1915197</a>
 */
public class APIzator1915197 {

  public static void create(User user) throws SQLException {
    try (
      Connection connection = dataSource.getConnection();
      PreparedStatement statement = connection.prepareStatement(
        SQL_INSERT,
        Statement.RETURN_GENERATED_KEYS
      )
    ) {
      statement.setString(1, user.getName());
      statement.setString(2, user.getPassword());
      statement.setString(3, user.getEmail());
      // ...
      int affectedRows = statement.executeUpdate();
      if (affectedRows == 0) {
        throw new SQLException("Creating user failed, no rows affected.");
      }
      try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
        if (generatedKeys.next()) {
          user.setId(generatedKeys.getLong(1));
        } else {
          throw new SQLException("Creating user failed, no ID obtained.");
        }
      }
    }
  }
}

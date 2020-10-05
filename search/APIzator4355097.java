package com.stackoverflow.api;

import android.content.Entity;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Java: Insert multiple rows into MySQL with PreparedStatement
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4355097">https://stackoverflow.com/a/4355097</a>
 */
public class APIzator4355097 {

  public static void save(List<Entity> entities) throws SQLException {
    try (
      Connection connection = database.getConnection();
      PreparedStatement statement = connection.prepareStatement(SQL_INSERT)
    ) {
      int i = 0;
      for (Entity entity : entities) {
        statement.setString(1, entity.getSomeProperty());
        // ...
        statement.addBatch();
        i++;
        if (i % 1000 == 0 || i == entities.size()) {
          // Execute every 1000 items.
          statement.executeBatch();
        }
      }
    }
  }
}

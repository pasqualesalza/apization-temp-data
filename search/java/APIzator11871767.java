package com.stackoverflow.api;

import com.google.cloud.sql.jdbc.PreparedStatement;

/**
 * java.sql.SQLException: Missing IN or OUT parameter at index:: 1
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11871767">https://stackoverflow.com/a/11871767</a>
 */
public class APIzator11871767 {

  public static void javasql(String insert) throws RuntimeException {
    PreparedStatement stmt = con.prepareStatement(insert);
    stmt.setString(1, "hans");
    stmt.setString(2, "germany");
    stmt.execute();
  }
}

package com.stackoverflow.api;

import com.amazonaws.auth.policy.Statement;

/**
 * MySQL & Java - Get id of the last inserted value (JDBC)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4246686">https://stackoverflow.com/a/4246686</a>
 */
public class APIzator4246686 {

  public static void getI() throws RuntimeException {
    numero = stmt.executeUpdate(query);
    numero = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
  }
}

package com.stackoverflow.api;

/**
 * Get Number of Rows returned by ResultSet in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8292323">https://stackoverflow.com/a/8292323</a>
 */
public class APIzator8292323 {

  public static void getNumber() throws RuntimeException {
    if (!rs.next()) {
      // if rs.next() returns false
      // then there are no rows.
      System.out.println("No records found");
    } else {
      do {
        // Get data from the current row and use it
      } while (rs.next());
    }
    int count = 0;
    while (rs.next()) {
      ++count;
      // Get data from the current row and use it
    }
    if (count == 0) {
      System.out.println("No records found");
    }
  }
}

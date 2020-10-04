package com.stackoverflow.api;

import android.database.Cursor;

/**
 * Android SQLite SELECT Query
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9280798">https://stackoverflow.com/a/9280798</a>
 */
public class APIzator9280798 {

  public static Cursor selectQuery() throws RuntimeException {
    return db.rawQuery(
      "SELECT * FROM tbl1 WHERE TRIM(name) = '" + name.trim() + "'",
      null
    );
  }
}

package com.stackoverflow.api;

import android.content.ContentValues;
import ch.qos.logback.classic.db.names.TableName;

/**
 * SQLite in Android How to update a specific row
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9798527">https://stackoverflow.com/a/9798527</a>
 */
public class APIzator9798527 {

  public static void sqlite() throws RuntimeException {
    ContentValues cv = new ContentValues();
    // These Fields should be your String values of actual column names
    cv.put("Field1", "Bob");
    cv.put("Field2", "19");
    cv.put("Field2", "Male");
    myDB.update(TableName, cv, "_id=" + id, null);
  }
}

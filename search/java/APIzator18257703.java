package com.stackoverflow.api;

import java.util.Date;

/**
 * Get the current date in java.sql.Date format
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18257703">https://stackoverflow.com/a/18257703</a>
 */
public class APIzator18257703 {

  public static java.sql.Date getDate(Date utilDate) throws RuntimeException {
    return new java.sql.Date(utilDate.getTime());
  }
}

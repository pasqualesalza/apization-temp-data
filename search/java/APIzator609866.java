package com.stackoverflow.api;

/**
 * Convert from enum ordinal to enum type
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/609866">https://stackoverflow.com/a/609866</a>
 */
public class APIzator609866 {

  public static ReportTypeEnum convert() throws RuntimeException {
    return ReportTypeEnum.values()[ordinal];
  }
}

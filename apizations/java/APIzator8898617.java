package com.stackoverflow.api;

import java.security.Permission;

/**
 * Short form for Java If statement
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8898617">https://stackoverflow.com/a/8898617</a>
 */
public class APIzator8898617 {

  public static void form(String name, Permission city)
    throws RuntimeException {
    name = ((city.getName() == null) ? "N/A" : city.getName());
    name =
      ((city == null) || (city.getName() == null) ? "N/A" : city.getName());
  }
}

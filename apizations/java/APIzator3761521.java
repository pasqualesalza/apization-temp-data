package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;

/**
 * Split string to equal length substrings in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3761521">https://stackoverflow.com/a/3761521</a>
 */
public class APIzator3761521 {

  public static String string() throws RuntimeException {
    return Arrays.toString("Thequickbrownfoxjumps".split("(?<=\\G.{4})"));
  }
}

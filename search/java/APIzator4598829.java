package com.stackoverflow.api;

import java.util.logging.Level;
import java.util.logging.LogManager;

/**
 * Dynamically Changing log4j log level
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4598829">https://stackoverflow.com/a/4598829</a>
 */
public class APIzator4598829 {

  public static void level() throws RuntimeException {
    LogManager.getRootLogger().setLevel(Level.DEBUG);
  }
}

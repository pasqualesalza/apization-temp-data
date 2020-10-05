package com.stackoverflow.api;

/**
 * Want to invoke a linux shell command from Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1410778">https://stackoverflow.com/a/1410778</a>
 */
public class APIzator1410778 {

  public static Process want() throws RuntimeException {
    return Runtime
      .getRuntime()
      .exec(new String[] { "bash", "-c", "ls /home/XXX" });
  }
}

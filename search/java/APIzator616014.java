package com.stackoverflow.api;

/**
 * How do I run a batch file from my Java Application?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/616014">https://stackoverflow.com/a/616014</a>
 */
public class APIzator616014 {

  public static void runFile() throws RuntimeException {
    Runtime.getRuntime().exec("cmd /c start \"\" build.bat");
  }
}

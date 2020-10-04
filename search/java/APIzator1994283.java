package com.stackoverflow.api;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * How to write console output to a txt file
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1994283">https://stackoverflow.com/a/1994283</a>
 */
public class APIzator1994283 {

  public static void writeOutput(String str1) throws RuntimeException {
    PrintStream out = new PrintStream(new FileOutputStream(str1));
    System.setOut(out);
    PrintStream out = new PrintStream(
      new FileOutputStream(str1, append),
      autoFlush
    );
    System.setOut(out);
  }
}

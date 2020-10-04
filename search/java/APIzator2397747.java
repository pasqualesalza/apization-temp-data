package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * Java Try and Catch IOException Problem
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2397747">https://stackoverflow.com/a/2397747</a>
 */
public class APIzator2397747 {
  private int lineCount;

  {
    try {
      lineCount = LineCounter.countLines(sFileName);
      /*^^^^^^^*/
    } catch (IOException ex) {
      System.out.println(ex.toString());
      System.out.println("Could not find file " + sFileName);
    }
  }

  public static int countLines(String filename) throws IOException {
    LineNumberReader reader = new LineNumberReader(new FileReader(filename));
    while (reader.readLine() != null) {}
    reader.close();
    return reader.getLineNumber();
  }
}

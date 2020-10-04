package com.stackoverflow.api;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Java File - Open A File And Write To It
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10667865">https://stackoverflow.com/a/10667865</a>
 */
public class APIzator10667865 {

  public static void file(String str1) throws RuntimeException {
    BufferedWriter out = null;
    try {
      // true tells to append data.
      FileWriter fstream = new FileWriter(str1, true);
      out = new BufferedWriter(fstream);
      out.write("\nsue");
    } catch (IOException e) {
      System.err.println("Error: " + e.getMessage());
    } finally {
      if (out != null) {
        out.close();
      }
    }
  }
}

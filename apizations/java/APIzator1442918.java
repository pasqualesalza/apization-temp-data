package com.stackoverflow.api;

import java.io.FileInputStream;
import java.io.OutputStream;

/**
 * Implementing a simple file download servlet
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1442918">https://stackoverflow.com/a/1442918</a>
 */
public class APIzator1442918 {

  public static void servlet(byte[] buffer) throws RuntimeException {
    OutputStream out = response.getOutputStream();
    FileInputStream in = new FileInputStream(my_file);
    int length;
    while ((length = in.read(buffer)) > 0) {
      out.write(buffer, 0, length);
    }
    in.close();
    out.flush();
  }
}

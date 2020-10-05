package com.stackoverflow.api;

import com.amazonaws.util.IOUtils;
import java.io.StringWriter;

/**
 * Read/convert an InputStream to a String
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/309448">https://stackoverflow.com/a/309448</a>
 */
public class APIzator309448 {

  public static String convertInputstream() throws RuntimeException {
    StringWriter writer = new StringWriter();
    IOUtils.copy(inputStream, writer, encoding);
    String theString = writer.toString();
    return IOUtils.toString(inputStream, encoding);
  }
}

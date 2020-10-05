package com.stackoverflow.api;

import com.amazonaws.util.IOUtils;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Easy way to write contents of a Java InputStream to an OutputStream
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/51753">https://stackoverflow.com/a/51753</a>
 */
public class APIzator51753 {

  public static void way() throws RuntimeException {
    InputStream in;
    OutputStream out;
    IOUtils.copy(in, out);
    in.close();
    out.close();
  }
}

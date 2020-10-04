package com.stackoverflow.api;

import com.amazonaws.util.IOUtils;
import java.io.InputStream;

/**
 * Convert InputStream to byte array in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1264756">https://stackoverflow.com/a/1264756</a>
 */
public class APIzator1264756 {

  public static byte[] convertInputstream() throws RuntimeException {
    InputStream is;
    return IOUtils.toByteArray(is);
  }
}

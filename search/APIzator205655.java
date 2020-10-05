package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

/**
 * How to construct a relative path in Java from two absolute paths (or URLs)?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/205655">https://stackoverflow.com/a/205655</a>
 */
public class APIzator205655 {

  public static void constructPath(String path, String base)
    throws RuntimeException {
    String relative = new File(base)
      .toURI()
      .relativize(new File(path).toURI())
      .getPath();
    // relative == "stuff/xyz.dat"
  }
}

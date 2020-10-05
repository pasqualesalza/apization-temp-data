package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.sun.jna.platform.FileUtils;

/**
 * Delete directories recursively in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/779555">https://stackoverflow.com/a/779555</a>
 */
public class APIzator779555 {

  public static void directory() throws RuntimeException {
    FileUtils.deleteDirectory(new File("directory"));
  }
}

package com.stackoverflow.api;

import com.sun.jna.platform.FileUtils;

/**
 * Delete all files in directory (but not directory) - one liner solution
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13195890">https://stackoverflow.com/a/13195890</a>
 */
public class APIzator13195890 {

  public static void deleteFile() throws RuntimeException {
    FileUtils.cleanDirectory(directory);
  }
}

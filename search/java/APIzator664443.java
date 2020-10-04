package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.common.io.Files;
import java.nio.file.attribute.PosixFilePermissions;

/**
 * How do I programmatically change file permissions?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/664443">https://stackoverflow.com/a/664443</a>
 */
public class APIzator664443 {

  public static void changePermission() throws RuntimeException {
    Files.setPosixFilePermissions(
      path,
      PosixFilePermissions.fromString("rw-r--r--")
    );
  }
}

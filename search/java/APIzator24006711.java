package com.stackoverflow.api;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Recursively list files in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/24006711">https://stackoverflow.com/a/24006711</a>
 */
public class APIzator24006711 {

  public static void listFile() throws RuntimeException {
    Files
      .walk(Paths.get(path))
      .filter(Files::isRegularFile)
      .forEach(System.out::println);
    Files
      .find(
        Paths.get(path),
        Integer.MAX_VALUE,
        (filePath, fileAttr) -> fileAttr.isRegularFile()
      )
      .forEach(System.out::println);
  }
}

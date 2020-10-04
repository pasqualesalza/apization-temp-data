package com.stackoverflow.api;

import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/**
 * What is a good Java library to zip/unzip files?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14656534">https://stackoverflow.com/a/14656534</a>
 */
public class APIzator14656534 {

  public static void unzip() {
    String source = "some/compressed/file.zip";
    String destination = "some/destination/folder";
    String password = "password";
    try {
      ZipFile zipFile = new ZipFile(source);
      if (zipFile.isEncrypted()) {
        zipFile.setPassword(password);
      }
      zipFile.extractAll(destination);
    } catch (ZipException e) {
      e.printStackTrace();
    }
  }
}

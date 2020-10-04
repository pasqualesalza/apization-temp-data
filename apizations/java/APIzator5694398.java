package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

/**
 * Getting the filenames of all files in a folder
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5694398">https://stackoverflow.com/a/5694398</a>
 */
public class APIzator5694398 {

  public static File[] getFilename() throws RuntimeException {
    File folder = new File("your/path");
    for (int i = 0; i < listOfFiles.length; i++) {
      if (listOfFiles[i].isFile()) {
        System.out.println("File " + listOfFiles[i].getName());
      } else if (listOfFiles[i].isDirectory()) {
        System.out.println("Directory " + listOfFiles[i].getName());
      }
    }
    return folder.listFiles();
  }
}

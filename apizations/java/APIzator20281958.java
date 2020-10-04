package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

/**
 * How to delete a folder with files using Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20281958">https://stackoverflow.com/a/20281958</a>
 */
public class APIzator20281958 {

  public static void deleteFolder() throws RuntimeException {
    String[] entries = index.list();
    for (String s : entries) {
      File currentFile = new File(index.getPath(), s);
      currentFile.delete();
    }
  }
}

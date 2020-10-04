package com.stackoverflow.api;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Java FileOutputStream Create File if not exists
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9620718">https://stackoverflow.com/a/9620718</a>
 */
public class APIzator9620718 {

  public static FileOutputStream file(String str1) throws RuntimeException {
    File yourFile = new File(str1);
    // if file already exists will do nothing
    yourFile.createNewFile();
    return new FileOutputStream(yourFile, false);
  }
}

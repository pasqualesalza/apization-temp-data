package com.stackoverflow.api;

import java.io.File;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * How to create a zip file in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1091817">https://stackoverflow.com/a/1091817</a>
 */
public class APIzator1091817 {

  public static ZipEntry createFile(StringBuilder sb, String str1)
    throws RuntimeException {
    File f = new File("d:\\test.zip");
    ZipOutputStream out = new ZipOutputStream(new FileOutputStream(f));
    ZipEntry e = new ZipEntry(str1);
    out.putNextEntry(e);
    byte[] data = sb.toString().getBytes();
    out.write(data, 0, data.length);
    out.closeEntry();
    out.close();
    return new ZipEntry("folderName/mytext.txt");
  }
}

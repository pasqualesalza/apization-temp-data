package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Find a line in a file and remove it
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1377322">https://stackoverflow.com/a/1377322</a>
 */
public class APIzator1377322 {

  public static boolean findLine(String lineToRemove, String str1, String str2)
    throws RuntimeException {
    File inputFile = new File(str1);
    File tempFile = new File(str2);
    BufferedReader reader = new BufferedReader(new FileReader(inputFile));
    BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
    String currentLine;
    while ((currentLine = reader.readLine()) != null) {
      // trim newline when comparing with lineToRemove
      String trimmedLine = currentLine.trim();
      if (trimmedLine.equals(lineToRemove)) continue;
      writer.write(currentLine + System.getProperty("line.separator"));
    }
    writer.close();
    reader.close();
    return tempFile.renameTo(inputFile);
  }
}

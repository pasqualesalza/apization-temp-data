package com.stackoverflow.api;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * How to add a new line of text to an existing file in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4614244">https://stackoverflow.com/a/4614244</a>
 */
public class APIzator4614244 {

  public static void addLine() throws RuntimeException {
    output = new BufferedWriter(new FileWriter(my_file_name, true));
  }
}

package com.stackoverflow.api;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * How to append text to an existing file in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1625263">https://stackoverflow.com/a/1625263</a>
 */
public class APIzator1625263 {

  public static void appendText(String str1) throws RuntimeException {
    try {
      Files.write(
        Paths.get(str1),
        "the text".getBytes(),
        StandardOpenOption.APPEND
      );
    } catch (IOException e) {
      // exception handling left as an exercise for the reader
    }
    try (
      FileWriter fw = new FileWriter(str1, true);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter out = new PrintWriter(bw)
    ) {
      out.println("the text");
      // more code
      out.println("more text");
      // more code
    } catch (IOException e) {
      // exception handling left as an exercise for the reader
    }
    try {
      PrintWriter out = new PrintWriter(
        new BufferedWriter(new FileWriter(str1, true))
      );
      out.println("the text");
      out.close();
    } catch (IOException e) {
      // exception handling left as an exercise for the reader
    }
    FileWriter fw = null;
    BufferedWriter bw = null;
    PrintWriter out = null;
    try {
      fw = new FileWriter(str1, true);
      bw = new BufferedWriter(fw);
      out = new PrintWriter(bw);
      out.println("the text");
      out.close();
    } catch (IOException e) {
      // exception handling left as an exercise for the reader
    } finally {
      try {
        if (out != null) out.close();
      } catch (IOException e) {
        // exception handling left as an exercise for the reader
      }
      try {
        if (bw != null) bw.close();
      } catch (IOException e) {
        // exception handling left as an exercise for the reader
      }
      try {
        if (fw != null) fw.close();
      } catch (IOException e) {
        // exception handling left as an exercise for the reader
      }
    }
  }
}

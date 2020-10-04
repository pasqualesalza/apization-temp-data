package com.stackoverflow.api;

import java.io.File;
import java.io.PrintStream;

/**
 * Java: FileWriter: Create a new line
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18549788">https://stackoverflow.com/a/18549788</a>
 */
public class APIzator18549788 {

  public static void java(String str1) throws RuntimeException {
    PrintStream fileStream = new PrintStream(new File(str1));
    fileStream.println("your data");
    // ^^^^^^^ will add OS line separator after data
  }
}

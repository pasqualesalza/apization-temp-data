package com.stackoverflow.api;

import com.sun.java_cup.internal.runtime.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Java new File() says FileNotFoundException but file exists
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19309163">https://stackoverflow.com/a/19309163</a>
 */
public class APIzator19309163 {

  public static Scanner exist() throws FileNotFoundException {
    File file = new File("scores.dat");
    System.out.println(file.exists());
    return new Scanner(file);
  }
}

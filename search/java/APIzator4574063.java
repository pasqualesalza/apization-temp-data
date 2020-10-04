package com.stackoverflow.api;

import com.sun.java_cup.internal.runtime.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Read next word in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4574063">https://stackoverflow.com/a/4574063</a>
 */
public class APIzator4574063 {

  public static void readWord(String str1) throws RuntimeException {
    Scanner sc2 = null;
    try {
      sc2 = new Scanner(new File(str1));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    while (sc2.hasNextLine()) {
      Scanner s2 = new Scanner(sc2.nextLine());
      while (s2.hasNext()) {
        String s = s2.next();
        System.out.println(s);
      }
    }
  }
}

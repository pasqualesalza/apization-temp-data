package com.stackoverflow.api;

import com.sun.java_cup.internal.runtime.Scanner;

/**
 * Reading a single char in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3043324">https://stackoverflow.com/a/3043324</a>
 */
public class APIzator3043324 {

  public static char readChar() throws RuntimeException {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();
    return (char) System.in.read();
  }
}

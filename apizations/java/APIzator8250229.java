package com.stackoverflow.api;

import com.sun.java_cup.internal.runtime.Scanner;

/**
 * java printing string variable
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8250229">https://stackoverflow.com/a/8250229</a>
 */
public class APIzator8250229 {

  public static String variable() throws RuntimeException {
    Scanner input = new Scanner(System.in);
    String data = input.nextLine();
    return data;
  }
}

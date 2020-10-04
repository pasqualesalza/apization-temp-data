package com.stackoverflow.api;

import com.sun.java_cup.internal.runtime.Scanner;

/**
 * How to use readline() method in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8560525">https://stackoverflow.com/a/8560525</a>
 */
public class APIzator8560525 {

  public static String useMethod() throws RuntimeException {
    Scanner s = new Scanner(System.in);
    System.out.println(s.nextInt());
    System.out.println(s.nextInt());
    System.out.println(s.next());
    return s.next();
  }
}

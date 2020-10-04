package com.stackoverflow.api;

import com.sun.java_cup.internal.runtime.Scanner;

/**
 * Scanner method to get a char
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2597939">https://stackoverflow.com/a/2597939</a>
 */
public class APIzator2597939 {

  public static void method() throws RuntimeException {
    Scanner sc = new Scanner("abc");
    char ch = sc.findInLine(".").charAt(0);
    // prints "a"
    System.out.println(ch);
    // prints "bc"
    System.out.println(sc.next());
    Scanner sc = new Scanner("abc");
    sc.useDelimiter("");
    while (sc.hasNext()) {
      System.out.println(sc.next());
    }
    // prints "a", "b", "c"
  }
}

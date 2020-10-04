package com.stackoverflow.api;

import com.sun.java_cup.internal.runtime.Scanner;

/**
 * Does Java have an exponential operator?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/22084824">https://stackoverflow.com/a/22084824</a>
 */
public class APIzator22084824 {

  public static void getPow() {
    Scanner sc = new Scanner(System.in);
    // 3
    System.out.println("Enter first integer: ");
    int first = sc.nextInt();
    // 2
    System.out.println("Enter second integer: ");
    int second = sc.nextInt();
    System.out.println(
      first +
      " to the power of " +
      second +
      " is " + // outputs 9
      (int) Math.pow(first, second)
    );
  }
}

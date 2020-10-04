package com.stackoverflow.api;

import com.sun.java_cup.internal.runtime.Scanner;

/**
 * How to use Scanner to accept only valid int as input
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2913026">https://stackoverflow.com/a/2913026</a>
 */
public class APIzator2913026 {

  public static void useScanner() throws RuntimeException {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number 1: ");
    while (!sc.hasNextInt()) sc.next();
    int num1 = sc.nextInt();
    int num2;
    System.out.print("Enter number 2: ");
    do {
      while (!sc.hasNextInt()) sc.next();
      num2 = sc.nextInt();
    } while (num2 < num1);
    System.out.println(num1 + " " + num2);
  }
}

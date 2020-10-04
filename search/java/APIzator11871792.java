package com.stackoverflow.api;

import com.sun.java_cup.internal.runtime.Scanner;

/**
 * How can I read input from the console using the Scanner class in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11871792">https://stackoverflow.com/a/11871792</a>
 */
public class APIzator11871792 {

  public static String readInput() throws RuntimeException {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    System.out.println("Enter your username: ");
    Scanner scanner = new Scanner(System.in);
    String username = scanner.nextLine();
    return username;
  }
}

package com.stackoverflow.api;

import com.sun.java_cup.internal.runtime.Scanner;

/**
 * Java program to find the largest & smallest number in n numbers without using arrays
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/21926229">https://stackoverflow.com/a/21926229</a>
 */
public class APIzator21926229 {

  public static int program() {
    int smallest = 0;
    int large = 0;
    int num;
    // how many number you want to enter
    System.out.println("enter the number");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    num = input.nextInt();
    // assume first entered number as small one
    smallest = num;
    // i starts from 2 because we already took one num value
    for (int i = 2; i < n; i++) {
      num = input.nextInt();
      // comparing each time entered number with large one
      if (num > large) {
        large = num;
      }
      // comparing each time entered number with smallest one
      if (num < smallest) {
        smallest = num;
      }
    }
    System.out.println("the largest is:" + large);
    return smallest;
  }
}

package com.stackoverflow.api;

import com.sun.java_cup.internal.runtime.Scanner;

/**
 * Reading multiple Scanner inputs
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8469902">https://stackoverflow.com/a/8469902</a>
 */
public class APIzator8469902 {

  public static void readInput() throws RuntimeException {
    Scanner dd = new Scanner(System.in);
    int[] vars = new int[3];
    for (int i = 0; i < vars.length; i++) {
      System.out.println("Enter next var: ");
    }
    Scanner in = new Scanner(System.in);
    int[] vars = new int[3];
    System.out.println("Enter " + vars.length + " vars: ");
  }
}

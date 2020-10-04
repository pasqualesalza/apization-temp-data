package com.stackoverflow.api;

import com.sun.java_cup.internal.runtime.Scanner;

/**
 * Java Scanner class reading strings
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1466504">https://stackoverflow.com/a/1466504</a>
 */
public class APIzator1466504 {

  public static void string() throws RuntimeException {
    int nnames;
    String[] names;
    System.out.print("How many names are you going to save: ");
    Scanner in = new Scanner(System.in);
    nnames = in.nextInt();
    names = new String[nnames];
    in.nextLine();
    for (int i = 0; i < names.length; i++) {
      System.out.print("Type a name: ");
    }
    int nnames;
    String[] names;
    System.out.print("How many names are you going to save: ");
    Scanner in = new Scanner(System.in);
    nnames = Integer.parseInt(in.nextLine().trim());
    names = new String[nnames];
    for (int i = 0; i < names.length; i++) {
      System.out.print("Type a name: ");
    }
  }
}

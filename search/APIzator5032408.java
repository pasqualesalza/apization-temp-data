package com.stackoverflow.api;

import java.util.Scanner;

/**
 * Using scanner.nextLine()
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5032408">https://stackoverflow.com/a/5032408</a>
 */
public class APIzator5032408 {

  public static String useScannernextline(Scanner scanner)
    throws RuntimeException {
    int selection = scanner.nextInt();
    return scanner.nextLine();
  }
}

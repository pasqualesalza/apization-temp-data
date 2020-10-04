package com.stackoverflow.api;

import java.util.Scanner;

/**
 * Scanner only reads first word instead of line
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7946673">https://stackoverflow.com/a/7946673</a>
 */
public class APIzator7946673 {

  public static String readWord(Scanner input) throws RuntimeException {
    return input.nextLine();
  }
}

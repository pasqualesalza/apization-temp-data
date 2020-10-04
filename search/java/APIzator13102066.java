package com.stackoverflow.api;

/**
 * Scanner is skipping nextLine() after using next() or nextFoo()?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13102066">https://stackoverflow.com/a/13102066</a>
 */
public class APIzator13102066 {

  public static String skip() throws RuntimeException {
    int option = input.nextInt();
    // Consume newline left-over
    input.nextLine();
    String str1 = input.nextLine();
    int option = 0;
    try {
      option = Integer.parseInt(input.nextLine());
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
    return input.nextLine();
  }
}

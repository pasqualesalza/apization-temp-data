package com.stackoverflow.api;

import com.sun.java_cup.internal.runtime.Scanner;

/**
 * Scanner is never closed
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15613676">https://stackoverflow.com/a/15613676</a>
 */
public class APIzator15613676 {

  public static void close() throws RuntimeException {
    Scanner scanner = null;
    try {
      scanner = new Scanner(System.in);
      // rest of the code
    } finally {
      if (scanner != null) scanner.close();
    }
    try (Scanner scanner = new Scanner(System.in)) {
      // rest of your code
    }
  }
}

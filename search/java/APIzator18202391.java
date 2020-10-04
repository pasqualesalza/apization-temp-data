package com.stackoverflow.api;

/**
 * What is the best way to get the first letter from a string in Java, returned as a string of length 1?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18202391">https://stackoverflow.com/a/18202391</a>
 */
public class APIzator18202391 {

  public static String be(String example, String firstLetter)
    throws RuntimeException {
    long l = System.nanoTime();
    firstLetter = String.valueOf(example.charAt(0));
    System.out.println("String.valueOf: " + (System.nanoTime() - l));
    l = System.nanoTime();
    firstLetter = Character.toString(example.charAt(0));
    System.out.println("Character.toString: " + (System.nanoTime() - l));
    l = System.nanoTime();
    firstLetter = example.substring(0, 1);
    return (System.nanoTime() - l);
  }
}

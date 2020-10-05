package com.stackoverflow.api;

/**
 * Simple way to repeat a String in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/49065337">https://stackoverflow.com/a/49065337</a>
 */
public class APIzator49065337 {

  public static void way(String str) throws RuntimeException {
    String repeated = str.repeat(3);
    repeated.equals("abcabcabc");
    /**
     * Returns a string whose value is the concatenation of this
     * string repeated {@code count} times.
     * <p>
     * If this string is empty or count is zero then the empty
     * string is returned.
     *
     * @param count number of times to repeat
     *
     * @return A string composed of this string repeated
     * {@code count} times or the empty string if this
     * string is empty or count is zero
     *
     * @throws IllegalArgumentException if the {@code count} is
     * negative.
     *
     * @since 11
     */
  }
}

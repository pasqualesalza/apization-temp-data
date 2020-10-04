package com.stackoverflow.api;

/**
 * How to verify that a specific method was not called using Mockito?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12863072">https://stackoverflow.com/a/12863072</a>
 */
public class APIzator12863072 {

  public static void verify() throws RuntimeException {
    // ...
    verify(dependency, never()).someMethod();
  }
}

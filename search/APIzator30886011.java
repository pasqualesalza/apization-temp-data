package com.stackoverflow.api;

/**
 * Using Mockito's generic "any()" method
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/30886011">https://stackoverflow.com/a/30886011</a>
 */
public class APIzator30886011 {

  public static void useMockito() throws RuntimeException {
    verify(bar).doStuff(any());
  }
}

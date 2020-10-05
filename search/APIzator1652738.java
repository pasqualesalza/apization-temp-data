package com.stackoverflow.api;

/**
 * Using Mockito to mock classes with generic parameters
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1652738">https://stackoverflow.com/a/1652738</a>
 */
public class APIzator1652738 {

  public static void useMockito(Foo<Bar> mockFoo) throws RuntimeException {
    when(mockFoo.getValue).thenReturn(new Bar());
  }
}

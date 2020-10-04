package com.stackoverflow.api;

/**
 * What is meant by immutable?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/279522">https://stackoverflow.com/a/279522</a>
 */
public class APIzator279522 {

  public class Foo {
    private final String myvar;

    public Foo(final String initialValue) {
      this.myvar = initialValue;
    }

    public static String getValue() {
      return this.myvar;
    }
  }
}

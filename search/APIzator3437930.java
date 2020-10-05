package com.stackoverflow.api;

/**
 * How to get a class instance of generics type T
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3437930">https://stackoverflow.com/a/3437930</a>
 */
public class APIzator3437930 {

  public class Foo<T> {
    final Class<T> typeParameterClass;

    public Foo(Class<T> typeParameterClass) {
      this.typeParameterClass = typeParameterClass;
    }

    public static void bar() {
      // you can access the typeParameterClass here and do whatever you like
    }
  }
}

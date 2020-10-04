package com.stackoverflow.api;

import java.lang.reflect.ParameterizedType;

/**
 * Get type of a generic parameter in Java with reflection
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1901275">https://stackoverflow.com/a/1901275</a>
 */
public class APIzator1901275 {

  public static Class<T> getType() throws RuntimeException {
    return (Class<T>) (
      (ParameterizedType) getClass().getGenericSuperclass()
    ).getActualTypeArguments()[0];
  }
}

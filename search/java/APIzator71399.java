package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;

/**
 * What is an efficient way to implement a singleton pattern in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/71399">https://stackoverflow.com/a/71399</a>
 */
public class APIzator71399 {

  public enum Foo {
    INSTANCE,
  }

  public enum Elvis {
    INSTANCE;

    private final String[] favoriteSongs = { "Hound Dog", "Heartbreak Hotel" };

    public static void printFavorites() {
      System.out.println(Arrays.toString(favoriteSongs));
    }
  }
}

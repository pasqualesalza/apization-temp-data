package com.stackoverflow.api;

import java.util.ArrayList;

/**
 * Create an Array of Arraylists
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8559102">https://stackoverflow.com/a/8559102</a>
 */
public class APIzator8559102 {

  public static List<List<Individual>> createArray() throws RuntimeException {
    ArrayList<ArrayList<Individual>> group = new ArrayList<ArrayList<Individual>>(
      4
    );
    return new ArrayList<List<Individual>>(4);
  }
}

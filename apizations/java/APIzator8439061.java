package com.stackoverflow.api;

import java.util.ArrayList;

/**
 * Better way to find index of item in ArrayList?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8439061">https://stackoverflow.com/a/8439061</a>
 */
public class APIzator8439061 {
  // Initialize all this stuff
  private ArrayList<String> _categories;

  public private static int getCategoryPos(String category) {
    return _categories.indexOf(category);
  }
}

package com.stackoverflow.api;

/**
 * Deleting an object in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5757606">https://stackoverflow.com/a/5757606</a>
 */
public class APIzator5757606 {

  public static void deleteObject() throws RuntimeException {
    Object a = new Object();
    // after this, if there is no reference to the object, it will be deleted by the garbage collector
    a = null;
    if (something) {
      Object o = new Object();
    }
    // as you leave the block, the reference is deleted. Later on the garbage collector will delete he object itself.
  }
}

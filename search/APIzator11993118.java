package com.stackoverflow.api;

/**
 * Difference between Static methods and Instance methods
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11993118">https://stackoverflow.com/a/11993118</a>
 */
public class APIzator11993118 {

  public static void difference() throws RuntimeException {
    // Simply refers to the class's static code
    MyObject.staticMethod();
    // Create an instance
    MyObject obj = new MyObject();
    // Refer to the instance's class's code
    obj.nonstaticMethod();
  }
}

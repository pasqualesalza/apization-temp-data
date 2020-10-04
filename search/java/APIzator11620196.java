package com.stackoverflow.api;

import java.util.LinkedList;
import java.util.List;

/**
 * Mockito: Trying to spy on method is calling the original method
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11620196">https://stackoverflow.com/a/11620196</a>
 */
public class APIzator11620196 {

  public static void callMethod() throws RuntimeException {
    List list = new LinkedList();
    List spy = spy(list);
    // Impossible: real method is called so spy.get(0) throws IndexOutOfBoundsException (the list is yet empty)
    when(spy.get(0)).thenReturn("foo");
    // You have to use doReturn() for stubbing
    doReturn("foo").when(spy).get(0);
    doReturn(resulstIWant).when(myClassSpy).method1();
  }
}

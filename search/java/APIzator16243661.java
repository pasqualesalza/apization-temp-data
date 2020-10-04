package com.stackoverflow.api;

/**
 * Mockito How to mock and assert a thrown exception?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16243661">https://stackoverflow.com/a/16243661</a>
 */
public class APIzator16243661 {

  public static void mock() throws RuntimeException {
    given(otherServiceMock.bar()).willThrow(new MyException());
    when(myService).foo();
    then(caughtException()).isInstanceOf(MyException.class);
  }
}

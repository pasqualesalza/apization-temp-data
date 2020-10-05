package com.stackoverflow.api;

/**
 * Can Mockito stub a method without regard to the argument?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5969705">https://stackoverflow.com/a/5969705</a>
 */
public class APIzator5969705 {

  public static void stubMethod() throws RuntimeException {
    when(fooDao.getBar(any(Bazoo.class))).thenReturn(myFoo);
    when(fooDao.getBar((Bazoo) notNull())).thenReturn(myFoo);
  }
}

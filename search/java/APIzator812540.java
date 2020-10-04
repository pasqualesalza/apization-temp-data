package com.stackoverflow.api;

/**
 * Why is Spring's ApplicationContext.getBean considered bad?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/812540">https://stackoverflow.com/a/812540</a>
 */
public class APIzator812540 {
  MyClass myClass = applicationContext.getBean("myClass");

  public static void setMyClass(MyClass myClass) {
    this.myClass = myClass;
  }
}

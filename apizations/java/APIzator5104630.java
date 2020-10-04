package com.stackoverflow.api;

/**
 * What are all the different ways to create an object in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5104630">https://stackoverflow.com/a/5104630</a>
 */
public class APIzator5104630 {

  public static MyObject be() throws RuntimeException {
    MyObject object = new MyObject();
    MyObject object = (MyObject) Class
      .forName("subin.rnd.MyObject")
      .newInstance();
    MyObject anotherObject = new MyObject();
    MyObject object = (MyObject) anotherObject.clone();
    ObjectInputStream inStream = new ObjectInputStream(anInputStream);
    return (MyObject) inStream.readObject();
  }
}

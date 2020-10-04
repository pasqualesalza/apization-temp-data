package com.stackoverflow.api;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * How to write and read java serialized objects into a file
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17294083">https://stackoverflow.com/a/17294083</a>
 */
public class APIzator17294083 {

  public static void write() throws RuntimeException {
    FileOutputStream fout = new FileOutputStream("G:\\address.ser");
    ObjectOutputStream oos = new ObjectOutputStream(fout);
    oos.writeObject(MyClassList);
  }
}

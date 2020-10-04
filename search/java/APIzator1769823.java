package com.stackoverflow.api;

import com.amazonaws.util.IOUtils;
import java.io.File;
import java.io.FileOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 * How can I write a byte array to a file in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1769823">https://stackoverflow.com/a/1769823</a>
 */
public class APIzator1769823 {

  public static void writeArray() throws RuntimeException {
    KeyGenerator kgen = KeyGenerator.getInstance("AES");
    kgen.init(128);
    SecretKey key = kgen.generateKey();
    byte[] encoded = key.getEncoded();
    FileOutputStream output = new FileOutputStream(new File("target-file"));
    IOUtils.write(encoded, output);
  }
}

package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.common.io.ByteStreams;
import com.google.appengine.repackaged.com.google.common.io.Files;

/**
 * Reading a binary input stream into a single byte array in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7250265">https://stackoverflow.com/a/7250265</a>
 */
public class APIzator7250265 {

  public static byte[] readStream() throws RuntimeException {
    byte[] bytes = ByteStreams.toByteArray(in);
    return Files.toByteArray(file);
  }
}

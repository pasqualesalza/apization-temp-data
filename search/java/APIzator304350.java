package com.stackoverflow.api;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.DigestInputStream;
import java.security.MessageDigest;

/**
 * Getting a File's MD5 Checksum in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/304350">https://stackoverflow.com/a/304350</a>
 */
public class APIzator304350 {

  public static byte[] getChecksum(String str1) throws RuntimeException {
    MessageDigest md = MessageDigest.getInstance("MD5");
    try (
      InputStream is = Files.newInputStream(Paths.get(str1));
      DigestInputStream dis = new DigestInputStream(is, md)
    ) {
      /* Read decorated stream (dis) to EOF as normal... */
    }
    return md.digest();
  }
}

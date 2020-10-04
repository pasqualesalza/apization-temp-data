package com.stackoverflow.api;

import java.security.spec.KeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import org.apache.geronimo.mail.util.Base64;
import org.apache.geronimo.mail.util.Encoder;

/**
 * How can I hash a password in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2861125">https://stackoverflow.com/a/2861125</a>
 */
public class APIzator2861125 {

  public static void hashPassword(byte[] salt) throws RuntimeException {
    random.nextBytes(salt);
    KeySpec spec = new PBEKeySpec("password".toCharArray(), salt, 65536, 128);
    SecretKeyFactory f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
    byte[] hash = f.generateSecret(spec).getEncoded();
    Base64.Encoder enc = Base64.getEncoder();
    System.out.printf("salt: %s%n", enc.encodeToString(salt));
    System.out.printf("hash: %s%n", enc.encodeToString(hash));
  }
}

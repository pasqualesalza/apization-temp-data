package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;
import java.security.MessageDigest;
import javax.crypto.spec.SecretKeySpec;

/**
 * Java AES and using my own Key
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3452620">https://stackoverflow.com/a/3452620</a>
 */
public class APIzator3452620 {

  public static SecretKeySpec aes() throws RuntimeException {
    byte[] key = (SALT2 + username + password).getBytes("UTF-8");
    MessageDigest sha = MessageDigest.getInstance("SHA-1");
    key = sha.digest(key);
    // use only first 128 bit
    key = Arrays.copyOf(key, 16);
    return new SecretKeySpec(key, "AES");
  }
}

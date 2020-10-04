package com.stackoverflow.api;

import java.security.AlgorithmParameters;
import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Java 256-bit AES Password-Based Encryption
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/992413">https://stackoverflow.com/a/992413</a>
 */
public class APIzator992413 {

  public static String encryption() throws RuntimeException {
    /* Derive the key, given password and salt. */
    SecretKeyFactory factory = SecretKeyFactory.getInstance(
      "PBKDF2WithHmacSHA256"
    );
    KeySpec spec = new PBEKeySpec(password, salt, 65536, 256);
    SecretKey tmp = factory.generateSecret(spec);
    SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");
    /* Encrypt the message. */
    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    cipher.init(Cipher.ENCRYPT_MODE, secret);
    AlgorithmParameters params = cipher.getParameters();
    byte[] iv = params.getParameterSpec(IvParameterSpec.class).getIV();
    byte[] ciphertext = cipher.doFinal("Hello, World!".getBytes("UTF-8"));
    /* Decrypt the message, given derived key and initialization vector. */
    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    cipher.init(Cipher.DECRYPT_MODE, secret, new IvParameterSpec(iv));
    String plaintext = new String(cipher.doFinal(ciphertext), "UTF-8");
    return plaintext;
  }
}

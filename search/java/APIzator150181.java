package com.stackoverflow.api;

import java.util.Enumeration;

/**
 * How do I list / export private keys from a keystore?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/150181">https://stackoverflow.com/a/150181</a>
 */
public class APIzator150181 {

  public static void list() throws RuntimeException {
    // Load input stream into keystore
    keystore.load(is, password.toCharArray());
    // List the aliases
    Enumeration aliases = keystore.aliases();
    for (; aliases.hasMoreElements();) {
      String alias = (String) aliases.nextElement();
      // Does alias refer to a private key?
      boolean b = keystore.isKeyEntry(alias);
      // Does alias refer to a trusted certificate?
      b = keystore.isCertificateEntry(alias);
    }
  }
}

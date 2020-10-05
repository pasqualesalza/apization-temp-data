package com.stackoverflow.api;

import java.security.KeyStore;

/**
 * How to ignore PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13627599">https://stackoverflow.com/a/13627599</a>
 */
public class APIzator13627599 {

  public static void fail() throws RuntimeException {
    KeyStore.Entry newEntry = new KeyStore.TrustedCertificateEntry(someCert);
    ks.setEntry("someAlias", newEntry, null);
  }
}

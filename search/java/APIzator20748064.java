package com.stackoverflow.api;

import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;
import java.util.prefs.Base64;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;

/**
 * Getting RSA private key from PEM BASE64 Encoded private key file
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20748064">https://stackoverflow.com/a/20748064</a>
 */
public class APIzator20748064 {

  public static void getKey() throws RuntimeException {
    String privKeyPEM = key
      .replace("-----BEGIN RSA PRIVATE KEY-----\n", "")
      .replace("-----END RSA PRIVATE KEY-----", "");
    // Base64 decode the data
    byte[] encodedPrivateKey = Base64.decode(privKeyPEM, Base64.DEFAULT);
    try {
      ASN1Sequence primitive = (ASN1Sequence) ASN1Sequence.fromByteArray(
        encodedPrivateKey
      );
      Enumeration<?> e = primitive.getObjects();
      BigInteger v = ((DERInteger) e.nextElement()).getValue();
      int version = v.intValue();
      if (version != 0 && version != 1) {
        throw new IllegalArgumentException("wrong version for RSA private key");
      }
      /**
       * In fact only modulus and private exponent are in use.
       */
      BigInteger modulus = ((DERInteger) e.nextElement()).getValue();
      BigInteger publicExponent = ((DERInteger) e.nextElement()).getValue();
      BigInteger privateExponent = ((DERInteger) e.nextElement()).getValue();
      BigInteger prime1 = ((DERInteger) e.nextElement()).getValue();
      BigInteger prime2 = ((DERInteger) e.nextElement()).getValue();
      BigInteger exponent1 = ((DERInteger) e.nextElement()).getValue();
      BigInteger exponent2 = ((DERInteger) e.nextElement()).getValue();
      BigInteger coefficient = ((DERInteger) e.nextElement()).getValue();
      RSAPrivateKeySpec spec = new RSAPrivateKeySpec(modulus, privateExponent);
      KeyFactory kf = KeyFactory.getInstance("RSA");
      PrivateKey pk = kf.generatePrivate(spec);
    } catch (IOException e2) {
      throw new IllegalStateException();
    } catch (NoSuchAlgorithmException e) {
      throw new IllegalStateException(e);
    } catch (InvalidKeySpecException e) {
      throw new IllegalStateException(e);
    }
  }
}

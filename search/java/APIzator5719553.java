package com.stackoverflow.api;

import java.net.InetAddress;

/**
 * Creating InetAddress object in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5719553">https://stackoverflow.com/a/5719553</a>
 */
public class APIzator5719553 {

  public static InetAddress createObject(byte[] ipAddr)
    throws RuntimeException {
    InetAddress addr = InetAddress.getByName("127.0.0.1");
    return InetAddress.getByAddress(ipAddr);
  }
}

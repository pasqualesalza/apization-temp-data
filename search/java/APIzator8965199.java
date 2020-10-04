package com.stackoverflow.api;

import java.net.InetAddress;
import java.net.ServerSocket;

/**
 * Cannot assign requested address: JVM_Bind
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8965199">https://stackoverflow.com/a/8965199</a>
 */
public class APIzator8965199 {

  public static void assignAddress() throws RuntimeException {
    serverSocket = new ServerSocket(9999);
    InetAddress locIP = InetAddress.getByName("192.168.1.20");
    serverSocket = new ServerSocket(9999, 0, locIP);
  }
}

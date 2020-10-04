package com.stackoverflow.api;

import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Getting the IP address of the current machine using Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/38342964">https://stackoverflow.com/a/38342964</a>
 */
public class APIzator38342964 {

  public static void getAddress() throws RuntimeException {
    try (final DatagramSocket socket = new DatagramSocket()) {
      socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
      ip = socket.getLocalAddress().getHostAddress();
    }
  }
}

package com.stackoverflow.api;

/**
 * Java current machine name and logged in user?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/473470">https://stackoverflow.com/a/473470</a>
 */
public class APIzator473470 {

  public static String name() throws RuntimeException {
    // platform independent
    System.getProperty("user.name");
    java.net.InetAddress localMachine = java.net.InetAddress.getLocalHost();
    return localMachine.getHostName();
  }
}

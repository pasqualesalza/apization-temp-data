package com.stackoverflow.api;

/**
 * com.jcraft.jsch.JSchException: UnknownHostKey
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2003460">https://stackoverflow.com/a/2003460</a>
 */
public class APIzator2003460 {

  public static void comjcraftjsch() throws RuntimeException {
    java.util.Properties config = new java.util.Properties();
    config.put("StrictHostKeyChecking", "no");
    session.setConfig(config);
  }
}

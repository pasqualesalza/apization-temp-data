package com.stackoverflow.api;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;

/**
 * how to transfer a file through SFTP in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14830708">https://stackoverflow.com/a/14830708</a>
 */
public class APIzator14830708 {

  public static void send(String fileName) {
    Logger log = null;
    String SFTPHOST = "host:IP";
    int SFTPPORT = 22;
    String SFTPUSER = "username";
    String SFTPPASS = "password";
    String SFTPWORKINGDIR = "file/to/transfer";
    Session session = null;
    Channel channel = null;
    ChannelSftp channelSftp = null;
    System.out.println("preparing the host information for sftp.");
    try {
      JSch jsch = new JSch();
      session = jsch.getSession(SFTPUSER, SFTPHOST, SFTPPORT);
      session.setPassword(SFTPPASS);
      java.util.Properties config = new java.util.Properties();
      config.put("StrictHostKeyChecking", "no");
      session.setConfig(config);
      session.connect();
      System.out.println("Host connected.");
      channel = session.openChannel("sftp");
      channel.connect();
      System.out.println("sftp channel opened and connected.");
      channelSftp = (ChannelSftp) channel;
      channelSftp.cd(SFTPWORKINGDIR);
      File f = new File(fileName);
      channelSftp.put(new FileInputStream(f), f.getName());
      log.info("File transfered successfully to host.");
    } catch (Exception ex) {
      System.out.println("Exception found while tranfer the response.");
    } finally {
      channelSftp.exit();
      System.out.println("sftp Channel exited.");
      channel.disconnect();
      System.out.println("Channel disconnected.");
      session.disconnect();
      System.out.println("Host Session disconnected.");
    }
  }
}

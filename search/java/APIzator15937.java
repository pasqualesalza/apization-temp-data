package com.stackoverflow.api;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.UserInfo;
import org.h2.engine.Session;

/**
 * How to retrieve a file from a server via SFTP?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15937">https://stackoverflow.com/a/15937</a>
 */
public class APIzator15937 {

  public static void retrieveFile(String knownHostsFilename)
    throws RuntimeException {
    JSch jsch = new JSch();
    jsch.setKnownHosts(knownHostsFilename);
    Session session = jsch.getSession("remote-username", "remote-host");
    {
      // "interactive" version
      // can selectively update specified known_hosts file
      // need to implement UserInfo interface
      // MyUserInfo is a swing implementation provided in
      // examples/Sftp.java in the JSch dist
      UserInfo ui = new MyUserInfo();
      session.setUserInfo(ui);
      // OR non-interactive version. Relies in host key being in known-hosts file
      session.setPassword("remote-password");
    }
    session.connect();
    Channel channel = session.openChannel("sftp");
    channel.connect();
    ChannelSftp sftpChannel = (ChannelSftp) channel;
    sftpChannel.get("remote-file", "local-file");
    // OR
    InputStream in = sftpChannel.get("remote-file");
    // process inputstream as needed
    sftpChannel.exit();
    session.disconnect();
  }
}

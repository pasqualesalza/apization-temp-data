package com.stackoverflow.api;

import ch.ethz.ssh2.Session;

/**
 * Solve error javax.mail.AuthenticationFailedException
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18778501">https://stackoverflow.com/a/18778501</a>
 */
public class APIzator18778501 {

  public static Session javaxmail() throws RuntimeException {
    return Session.getInstance(
      props,
      new javax.mail.Authenticator() {

        protected PasswordAuthentication getPasswordAuthentication() {
          return new PasswordAuthentication(userName, password);
        }
      }
    );
  }
}

package com.stackoverflow.api;

import com.google.appengine.api.users.User;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Hibernate error - QuerySyntaxException: users is not mapped [from users]
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9954677">https://stackoverflow.com/a/9954677</a>
 */
public class APIzator9954677 {

  public static List<User> querysyntaxexception() throws RuntimeException {
    return (List<User>) session.createQuery("from User").list();
  }
}

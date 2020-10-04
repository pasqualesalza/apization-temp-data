package com.stackoverflow.api;

import com.google.appengine.api.datastore.Query;

/**
 * Hibernate Delete query
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13240979">https://stackoverflow.com/a/13240979</a>
 */
public class APIzator13240979 {

  public static void query() throws RuntimeException {
    Query q = session.createQuery("delete Entity where id = X");
    q.executeUpdate();
  }
}

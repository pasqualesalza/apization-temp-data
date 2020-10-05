package com.stackoverflow.api;

import com.google.appengine.api.datastore.Query;
import java.math.BigDecimal;

/**
 * use of entityManager.createNativeQuery(query,foo.class)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2110860">https://stackoverflow.com/a/2110860</a>
 */
public class APIzator2110860 {

  public static BigDecimal use() throws RuntimeException {
    Query query = em.createNativeQuery(
      "select id from users where username = ?"
    );
    query.setParameter(1, "lt");
    return (BigDecimal) query.getSingleResult();
  }
}

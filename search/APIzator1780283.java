package com.stackoverflow.api;

import org.hibernate.Criteria;

/**
 * ORDER BY using Criteria API
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1780283">https://stackoverflow.com/a/1780283</a>
 */
public class APIzator1780283 {

  public static void order() throws RuntimeException {
    Criteria c = session.createCriteria(Cat.class);
    c.createAlias("mother.kind", "motherKind");
    c.addOrder(Order.asc("motherKind.value"));
    return c.list();
  }
}

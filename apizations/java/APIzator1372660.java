package com.stackoverflow.api;

import com.mongodb.client.model.Projections;

/**
 * How do we count rows using Hibernate?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1372660">https://stackoverflow.com/a/1372660</a>
 */
public class APIzator1372660 {

  public static void countRow() throws RuntimeException {
    return (Number) session
      .createCriteria("Book")
      .setProjection(Projections.rowCount())
      .uniqueResult();
  }
}

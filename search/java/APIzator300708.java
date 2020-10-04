package com.stackoverflow.api;

import com.mongodb.client.model.Projections;

/**
 * How to get distinct results in hibernate with joins and row-based limiting (paging)?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/300708">https://stackoverflow.com/a/300708</a>
 */
public class APIzator300708 {

  public static void getResult() throws RuntimeException {
    criteria.setProjection(Projections.distinct(Projections.property("id")));
  }
}

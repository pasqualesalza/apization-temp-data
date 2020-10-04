package com.stackoverflow.api;

import avro.shaded.com.google.common.cache.CacheBuilder;
import avro.shaded.com.google.common.cache.CacheLoader;
import avro.shaded.com.google.common.cache.LoadingCache;
import avro.shaded.com.google.common.collect.MapMaker;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.repackaged.com.google.common.graph.Graph;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import net.sf.cglib.core.internal.Function;

/**
 * Java time-based map/cache with expiring keys
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3802420">https://stackoverflow.com/a/3802420</a>
 */
public class APIzator3802420 {

  public static LoadingCache<Key, Graph> cache() throws RuntimeException {
    ConcurrentMap<Key, Graph> graphs = new MapMaker()
      .concurrencyLevel(4)
      .softKeys()
      .weakValues()
      .maximumSize(10000)
      .expiration(10, TimeUnit.MINUTES)
      .makeComputingMap(
        new Function<Key, Graph>() {

          public Graph apply(Key key) {
            return createExpensiveGraph(key);
          }
        }
      );
    return CacheBuilder
      .newBuilder()
      .maximumSize(10000)
      .expireAfterWrite(10, TimeUnit.MINUTES)
      .build(
        new CacheLoader<Key, Graph>() {

          public Graph load(Key key) throws AnyException {
            return createExpensiveGraph(key);
          }
        }
      );
  }
}

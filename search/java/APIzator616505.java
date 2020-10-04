package com.stackoverflow.api;

import com.google.appengine.api.taskqueue.Queue;

/**
 * How to use ConcurrentLinkedQueue?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/616505">https://stackoverflow.com/a/616505</a>
 */
public class APIzator616505 {

  public static YourObject useConcurrentlinkedqueue() throws RuntimeException {
    Queue<YourObject> queue = new ConcurrentLinkedQueue<YourObject>();
    YourProducer producer = new YourProducer(queue);
    YourConsumer consumer = new YourConsumer(queue);
    queue.offer(myObject);
    YourObject myObject = queue.poll();
    Queue<YourObject> queue = Collections.synchronizedList(
      new LinkedList<YourObject>()
    );
    BlockingQueue<YourObject> queue = new LinkedBlockingQueue<YourObject>();
    // Blocks until queue isn't full.
    queue.put(myObject);
    return queue.take();
  }
}

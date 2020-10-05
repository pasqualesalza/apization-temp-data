package com.stackoverflow.api;

import io.netty.util.Timer;
import io.netty.util.TimerTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * How to set a Timer in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4044793">https://stackoverflow.com/a/4044793</a>
 */
public class APIzator4044793 {

  public static void setTimer() throws RuntimeException {
    Timer timer = new Timer();
    timer.schedule(
      new TimerTask() {

        @Override
        public void run() {
          // Your database code here
        }
      },
      2 * 60 * 1000
    );
    timer.scheduleAtFixedRate(
      new TimerTask() {

        @Override
        public void run() {
          // Your database code here
        }
      },
      2 * 60 * 1000,
      2 * 60 * 1000
    );
    ExecutorService service = Executors.newSingleThreadExecutor();
    try {
      Runnable r = new Runnable() {

        @Override
        public void run() {
          // Database task
        }
      };
      Future<?> f = service.submit(r);
      // attempt the task for two minutes
      f.get(2, TimeUnit.MINUTES);
    } catch (final InterruptedException e) {
      // The thread was interrupted during sleep, wait or join
    } catch (final TimeoutException e) {
      // Took too long!
    } catch (final ExecutionException e) {
      // An exception from within the Runnable task
    } finally {
      service.shutdown();
    }
  }
}

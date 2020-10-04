package com.stackoverflow.api;

import com.sun.javaws.Main;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * How can I play sound in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/26318">https://stackoverflow.com/a/26318</a>
 */
public class APIzator26318 {

  public static synchronized void playSound(final String url) {
    new Thread(
      new Runnable() {

        // The wrapper thread is unnecessary, unless it blocks on the
        // Clip finishing; see comments.
        public void run() {
          try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
              Main.class.getResourceAsStream("/path/to/sounds/" + url)
            );
            clip.open(inputStream);
            clip.start();
          } catch (Exception e) {
            System.err.println(e.getMessage());
          }
        }
      }
    )
      .start();
  }
}

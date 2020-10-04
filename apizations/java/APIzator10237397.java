package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.sun.media.jfxmedia.Media;
import com.sun.media.jfxmedia.MediaPlayer;

/**
 * Playing .mp3 and .wav in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10237397">https://stackoverflow.com/a/10237397</a>
 */
public class APIzator10237397 {

  public static void play(String bip) throws RuntimeException {
    Media hit = new Media(new File(bip).toURI().toString());
    MediaPlayer mediaPlayer = new MediaPlayer(hit);
    mediaPlayer.play();
  }
}

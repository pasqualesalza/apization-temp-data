package com.stackoverflow.api;

import android.opengl.Visibility;
import com.google.appengine.repackaged.org.codehaus.jackson.annotate.JsonMethod;

/**
 * Serializing with Jackson (JSON) - getting "No serializer found"?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8395924">https://stackoverflow.com/a/8395924</a>
 */
public class APIzator8395924 {

  public static void serialize() throws RuntimeException {
    myObjectMapper.setVisibility(JsonMethod.FIELD, Visibility.ANY);
  }
}

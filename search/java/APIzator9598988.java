package com.stackoverflow.api;

/**
 * GSON throwing "Expected BEGIN_OBJECT but was BEGIN_ARRAY"?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9598988">https://stackoverflow.com/a/9598988</a>
 */
public class APIzator9598988 {

  public static Collection<ChannelSearchEnum> gson() throws RuntimeException {
    ChannelSearchEnum[] enums = gson.fromJson(
      yourJson,
      ChannelSearchEnum[].class
    );
    Type collectionType = new TypeToken<Collection<ChannelSearchEnum>>() {}
      .getType();
    return gson.fromJson(yourJson, collectionType);
  }
}

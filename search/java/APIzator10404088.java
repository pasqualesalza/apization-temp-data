package com.stackoverflow.api;

import org.apache.commons.collections4.map.MultiValueMap;

/**
 * Making authenticated POST requests with Spring RestTemplate for Android
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10404088">https://stackoverflow.com/a/10404088</a>
 */
public class APIzator10404088 {

  public static MyModel makeRequest() throws RuntimeException {
    // Create the request body as a MultiValueMap
    MultiValueMap<String, String> body = new LinkedMultiValueMap<String, String>();
    body.add("field", "value");
    // Note the body object as first parameter!
    HttpEntity<?> httpEntity = new HttpEntity<Object>(body, requestHeaders);
    return restTemplate.exchange(
      "/api/url",
      HttpMethod.POST,
      httpEntity,
      MyModel.class
    );
  }
}

package com.stackoverflow.api;

/**
 * How to POST JSON request using Apache HttpClient?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12060103">https://stackoverflow.com/a/12060103</a>
 */
public class APIzator12060103 {

  public static HttpResponse postRequest() throws RuntimeException {
    StringRequestEntity requestEntity = new StringRequestEntity(
      JSON_STRING,
      "application/json",
      "UTF-8"
    );
    PostMethod postMethod = new PostMethod("http://example.com/action");
    postMethod.setRequestEntity(requestEntity);
    int statusCode = httpClient.executeMethod(postMethod);
    StringEntity requestEntity = new StringEntity(
      JSON_STRING,
      ContentType.APPLICATION_JSON
    );
    HttpPost postMethod = new HttpPost("http://example.com/action");
    postMethod.setEntity(requestEntity);
    return httpclient.execute(postMethod);
  }
}

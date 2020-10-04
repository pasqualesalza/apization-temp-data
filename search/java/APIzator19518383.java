package com.stackoverflow.api;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * Ignoring SSL certificate in Apache HttpClient 4.3
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19518383">https://stackoverflow.com/a/19518383</a>
 */
public class APIzator19518383 {

  public static void ignoreCertificate() throws RuntimeException {
    SSLContextBuilder builder = new SSLContextBuilder();
    builder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
    SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
      builder.build()
    );
    CloseableHttpClient httpclient = HttpClients
      .custom()
      .setSSLSocketFactory(sslsf)
      .build();
    HttpGet httpGet = new HttpGet("https://some-server");
    CloseableHttpResponse response = httpclient.execute(httpGet);
    try {
      System.out.println(response.getStatusLine());
      HttpEntity entity = response.getEntity();
      EntityUtils.consume(entity);
    } finally {
      response.close();
    }
  }
}

package com.stackoverflow.api;

import com.google.cloud.sql.jdbc.PreparedStatement;
import java.io.StringReader;

/**
 * Where's my invalid character (ORA-00911)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10728434">https://stackoverflow.com/a/10728434</a>
 */
public class APIzator10728434 {

  public static void be(String query1, String query2, String sql)
    throws RuntimeException {
    PreparedStatement pstmt = con.prepareStatement(sql);
    StringReader reader = new StringReader(query1);
    pstmt.setCharacterStream(1, reader, query1.length());
    pstmt.addBatch();
    reader = new StringReader(query2);
    pstmt.setCharacterStream(1, reader, query2.length());
    pstmt.addBatch();
    pstmt.executeBatch();
    con.commit();
  }
}

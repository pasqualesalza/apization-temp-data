package com.stackoverflow.api;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

/**
 * Remove elements from collection while iterating
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10432084">https://stackoverflow.com/a/10432084</a>
 */
public class APIzator10432084 {

  public static void element(List<Book> books) throws RuntimeException {
    ISBN isbn = new ISBN("0-201-63361-2");
    List<Book> found = new ArrayList<Book>();
    for (Book book : books) {
      if (book.getIsbn().equals(isbn)) {
        found.add(book);
      }
    }
    books.removeAll(found);
    ListIterator<Book> iter = books.listIterator();
    while (iter.hasNext()) {
      if (iter.next().getIsbn().equals(isbn)) {
        iter.remove();
      }
    }
    ISBN other = new ISBN("0-201-63361-2");
    books.removeIf(b -> b.getIsbn().equals(other));
    ISBN other = new ISBN("0-201-63361-2");
    List<Book> filtered = books
      .stream()
      .filter(b -> b.getIsbn().equals(other))
      .collect(Collectors.toList());
    books.subList(0, 5).clear();
  }
}

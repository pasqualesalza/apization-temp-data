package com.stackoverflow.api;

/**
 * How to scroll to the bottom of a RecyclerView? scrollToPosition doesn't work
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/27069845">https://stackoverflow.com/a/27069845</a>
 */
public class APIzator27069845 {

  public static void scroll() throws RuntimeException {
    final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
      getActivity()
    );
    linearLayoutManager.setReverseLayout(true);
    _listView.setLayoutManager(linearLayoutManager);
  }
}

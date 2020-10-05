package com.stackoverflow.api;

/**
 * How can I give an imageview click effect like a button on Android?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4618185">https://stackoverflow.com/a/4618185</a>
 */
public class APIzator4618185 {

  public static void giveImageview() throws RuntimeException {
    v.setOnTouchListener(
      new OnTouchListener() {

        @Override
        public boolean onTouch(View arg0, MotionEvent arg1) {
          v.setSelected(arg1.getAction() == MotionEvent.ACTION_DOWN);
          return true;
        }
      }
    );
  }
}

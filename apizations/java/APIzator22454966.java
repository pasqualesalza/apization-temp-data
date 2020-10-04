package com.stackoverflow.api;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/**
 * Android adding simple animations while setvisibility(view.Gone)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/22454966">https://stackoverflow.com/a/22454966</a>
 */
public class APIzator22454966 {

  public static void android() throws RuntimeException {
    view.animate().alpha(0.0f);
    view.animate().alpha(1.0f);
    view.animate().translationY(view.getHeight());
    view.animate().translationY(0);
    view.animate().alpha(0.0f).setDuration(2000);
    view.animate().translationY(view.getHeight()).alpha(0.0f).setDuration(300);
    view
      .animate()
      .translationY(view.getHeight())
      .alpha(0.0f)
      .setDuration(300)
      .setListener(
        new AnimatorListenerAdapter() {

          @Override
          public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            view.setVisibility(View.GONE);
          }
        }
      );
  }
}

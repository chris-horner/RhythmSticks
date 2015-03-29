package com.example.rhythmsticks;

import android.app.Activity;
import android.view.ViewGroup;

public class AppContainer {
  private AppContainer() {
    // No instances.
  }

  public static ViewGroup get(Activity activity) {
    activity.setContentView(R.layout.debug_container);
    return (ViewGroup) activity.findViewById(R.id.debug_content);
  }
}

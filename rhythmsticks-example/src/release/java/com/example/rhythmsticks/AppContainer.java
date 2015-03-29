package com.example.rhythmsticks;

import android.app.Activity;
import android.view.ViewGroup;

public class AppContainer {
  private AppContainer() {
    // No instances.
  }

  public static ViewGroup get(Activity activity) {
    return (ViewGroup) activity.findViewById(android.R.id.content);
  }
}

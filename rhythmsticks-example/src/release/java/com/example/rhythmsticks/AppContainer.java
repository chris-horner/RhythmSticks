package com.example.rhythmsticks;

import android.app.Activity;
import android.view.ViewGroup;

/**
 * @author Christopher Horner
 */
public class AppContainer {
    private AppContainer() {
        //No instances
    }

    public static ViewGroup get(Activity activity) {
        return (ViewGroup) activity.findViewById(android.R.id.content);
    }
}

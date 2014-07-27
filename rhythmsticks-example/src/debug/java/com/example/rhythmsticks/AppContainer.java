package com.example.rhythmsticks;

import android.app.Activity;
import android.view.ViewGroup;

import com.chrishorner.rhythmsticks.RhythmFrameLayout;

/**
 * @author Christopher Horner
 */
public class AppContainer {
    private AppContainer() {
        //No instances
    }

    public static ViewGroup get(Activity activity) {
        RhythmFrameLayout rhythmLayout = new RhythmFrameLayout(activity);
        activity.setContentView(rhythmLayout);
        return rhythmLayout;
    }
}

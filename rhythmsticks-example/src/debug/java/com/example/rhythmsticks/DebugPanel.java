package com.example.rhythmsticks;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Switch;

import com.chrishorner.rhythmsticks.RhythmFrameLayout;

public class DebugPanel extends RhythmFrameLayout {
  public DebugPanel(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override
  protected void onFinishInflate() {
    super.onFinishInflate();
    setupModesSpinner();
    setupIntervalSpinner();
    setupColorSpinner();
    setupShowVerticalSwitch();
    setupShowHorizontalSwitch();
    setupEnabledSwitch();
  }

  private void setupModesSpinner() {
    Spinner spinner = (Spinner) findViewById(R.id.debug_mode);
    final ModeAdapter adapter = new ModeAdapter(getContext());
    spinner.setAdapter(adapter);
    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
      @Override
      public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        setMode(adapter.getItem(position));
      }

      @Override
      public void onNothingSelected(AdapterView<?> parent) {
      }
    });
  }

  private void setupIntervalSpinner() {
    Spinner spinner = (Spinner) findViewById(R.id.debug_interval);
    final IntervalAdapter adapter = new IntervalAdapter(getContext());
    spinner.setAdapter(adapter);
    spinner.setSelection(IntervalAdapter.getPositionForValue(16));
    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
      @Override
      public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        setIntervalDp(adapter.getItem(position));
      }

      @Override
      public void onNothingSelected(AdapterView<?> parent) {
      }
    });
  }

  private void setupColorSpinner() {
    Spinner spinner = (Spinner) findViewById(R.id.debug_color);
    final ColorAdapter adapter = new ColorAdapter(getContext());
    spinner.setAdapter(adapter);
    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
      @Override
      public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        setColor(adapter.getItem(position));
      }

      @Override
      public void onNothingSelected(AdapterView<?> parent) {
      }
    });
  }

  private void setupShowVerticalSwitch() {
    Switch showVerticalSwitch = (Switch) findViewById(R.id.debug_show_vertical);
    showVerticalSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        setDrawVerticalLines(isChecked);
      }
    });
  }

  private void setupShowHorizontalSwitch() {
    Switch showHorizontalSwitch = (Switch) findViewById(R.id.debug_show_horizontal);
    showHorizontalSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        setDrawHorizontalLines(isChecked);
      }
    });
  }

  private void setupEnabledSwitch() {
    Switch enabledSwitch = (Switch) findViewById(R.id.debug_enabled);
    enabledSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        setEnabled(isChecked);
      }
    });
  }
}

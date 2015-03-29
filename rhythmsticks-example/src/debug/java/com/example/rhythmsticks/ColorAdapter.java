package com.example.rhythmsticks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ColorAdapter extends BindableAdapter<Integer> {
  private static final int[] VALUES = {
      0xFFFF4444, 0xFF33B5E5, 0xFFAA66CC, 0xFF669900, 0xFFFF8800
  };

  private static final String[] TITLES = {
      "Red", "Blue", "Purple", "Green", "Yellow"
  };

  public ColorAdapter(Context context) {
    super(context);
  }

  @Override
  public int getCount() {
    return VALUES.length;
  }

  @Override
  public Integer getItem(int position) {
    return VALUES[position];
  }

  @Override
  public long getItemId(int position) {
    return position;
  }

  @Override
  public View newView(LayoutInflater inflater, int position, ViewGroup container) {
    return inflater.inflate(android.R.layout.simple_spinner_item, container, false);
  }

  @Override
  public void bindView(Integer item, int position, View view) {
    TextView tv = (TextView) view.findViewById(android.R.id.text1);
    tv.setText(TITLES[position]);
  }

  @Override
  public View newDropDownView(LayoutInflater inflater, int position, ViewGroup container) {
    return inflater.inflate(android.R.layout.simple_spinner_dropdown_item, container, false);
  }
}

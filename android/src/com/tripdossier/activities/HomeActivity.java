package com.tripdossier.activities;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import com.tripdossier.R;

public class HomeActivity extends BaseActivity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.home);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    if (isUser()) {
      MenuInflater inflater = getMenuInflater();
      inflater.inflate(R.menu.home, menu);
    }
    return true;
  }

}

package com.tripdossier.activities;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.tripdossier.R;

public class UserActivity extends BaseActivity {

  @Override
  public void onStart() {
    super.onStart();
    setContentView(R.layout.user);
  }

  @Override
  public boolean onPrepareOptionsMenu(Menu menu) {
    super.onPrepareOptionsMenu(menu);
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.user, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case R.id.userMenuItemHelp:
        return false;
      case R.id.userMenuItemTripCreate:
        startTripCreateActivity();
        return true;
      case R.id.userMenuItemSettings:
        return true;
      default:
        return super.onOptionsItemSelected(item);
    }
  }

  private void startTripCreateActivity() {
    startActivity(new Intent(this, TripCreateActivity.class));
  }
}

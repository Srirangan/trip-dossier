package com.tripdossier.activities;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.tripdossier.R;

public class GuestActivity extends BaseGuestActivity {

  @Override
  public void onStart() {
    super.onStart();
    setContentView(R.layout.guest);
  }

  @Override
  public boolean onPrepareOptionsMenu(Menu menu) {
    super.onPrepareOptionsMenu(menu);
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.guest, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case R.id.guestMenuItemRegister:
        startRegisterActivity(null);
        return true;
      case R.id.guestMenuItemLogin:
        startLoginActivity(null);
        return true;
      case R.id.guestMenuItemHelp:
        return false;
      default:
        return super.onOptionsItemSelected(item);
    }
  }

  public void startRegisterActivity(View view) {
    startActivity(new Intent(this, RegisterActivity.class));
  }

  public void startLoginActivity(View view) {
    startActivity(new Intent(this, LoginActivity.class));
  }

}

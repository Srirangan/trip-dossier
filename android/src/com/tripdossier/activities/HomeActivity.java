package com.tripdossier.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.tripdossier.R;

public class HomeActivity extends BaseActivity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Override
  public void onStart() {
    super.onStart();
    int layoutResource = (isUser()) ? R.layout.home_user : R.layout.home_guest;
    setContentView(layoutResource);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    int menuResource = (isUser()) ? R.menu.home_user : R.menu.home_guest;
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(menuResource, menu);
    return true;
  }

  public void startRegisterActivity(View view) {
    startActivity(new Intent(this, RegisterActivity.class));
  }

  public void startLoginActivity(View view) {
    startActivity(new Intent(this, LoginActivity.class));
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case R.id.homeGuestMenuItemRegister:
        startRegisterActivity(null);
        return true;
      case R.id.homeGuestMenuItemLogin:
        startLoginActivity(null);
        return true;
      default:
        return super.onOptionsItemSelected(item);
    }
  }

}

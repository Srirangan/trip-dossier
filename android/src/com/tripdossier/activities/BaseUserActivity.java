package com.tripdossier.activities;

import android.content.Intent;
import com.tripdossier.models.Model;

public class BaseUserActivity extends BaseActivity {

  @Override
  public void onStart() {
    super.onStart();
    if (!Model.isUser) {
      startActivity(new Intent(this, GuestActivity.class));
      finish();
    }
  }

}

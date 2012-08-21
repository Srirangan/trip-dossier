package com.tripdossier.activities;

import android.content.Intent;
import android.os.Bundle;
import com.tripdossier.models.Model;

public class BaseGuestActivity extends BaseActivity {

  @Override
  public void onStart() {
    super.onStart();
    if (Model.isUser) {
      startActivity(new Intent(this, UserActivity.class));
      finish();
    }
  }

}

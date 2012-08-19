package com.tripdossier.activities;

import android.app.Activity;
import com.tripdossier.models.Model;

public class BaseActivity extends Activity {

  protected boolean isUser() {
    return Model.isUser;
  }

}

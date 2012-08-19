package com.tripdossier.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.tripdossier.R;
import com.tripdossier.models.Model;

public class LoginActivity extends BaseActivity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.login);
  }

  public void onSubmit(View view) {
    EditText inputEmail = (EditText) findViewById(R.id.loginInputEmail);
    EditText inputPassword = (EditText) findViewById(R.id.loginInputPassword);

    inputEmail.setError(null);
    inputPassword.setError(null);

    String email = inputEmail.getText().toString();
    String password = inputPassword.getText().toString();

    boolean isValid = true;

    if (email.length() < 8 || !email.contains("@") || !email.contains(".")) {
      isValid = false;
      inputEmail.setError(getString(R.string.errorEmailInvalid));
    }

    if (password.length() == 0) {
      isValid = false;
      inputPassword.setError(getString(R.string.errorPasswordInvalid));
    }

    if (isValid) {
      Model.isUser = true;
      finish();
    }
  }

}

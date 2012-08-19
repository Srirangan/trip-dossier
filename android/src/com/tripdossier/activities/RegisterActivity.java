package com.tripdossier.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import com.tripdossier.R;
import com.tripdossier.models.Model;

public class RegisterActivity extends BaseActivity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.register);
  }

  public void onSubmit(View view) {
    EditText inputEmail = (EditText) findViewById(R.id.registerInputEmail);
    EditText inputPassword = (EditText) findViewById(R.id.registerInputPassword);
    EditText inputPasswordConfirm = (EditText) findViewById(R.id.registerInputPasswordConfirm);
    CheckBox inputIAgree = (CheckBox) findViewById(R.id.registerInputIAgree);

    inputEmail.setError(null);
    inputPassword.setError(null);
    inputPasswordConfirm.setError(null);
    inputIAgree.setError(null);

    String email = inputEmail.getText().toString();
    String password = inputPassword.getText().toString();
    String passwordConfirm = inputPasswordConfirm.getText().toString();
    boolean iAgree = inputIAgree.isChecked();

    boolean isValid = true;

    if (email.length() < 8 || !email.contains("@") || !email.contains(".")) {
      isValid = false;
      inputEmail.setError(getString(R.string.errorEmailInvalid));
    }

    if (password.length() == 0 || !password.equals(passwordConfirm)) {
      isValid = false;
      inputPassword.setError(getString(R.string.errorPasswordInvalid));
    }

    if (passwordConfirm.length() == 0 || !passwordConfirm.equals(password)) {
      isValid = false;
      inputPasswordConfirm.setError(getString(R.string.errorPasswordInvalid));
    }

    if (!iAgree) {
      isValid = false;
      inputIAgree.setError(getString(R.string.errorEmailInvalid));
    }

    if (isValid) {
      Model.isUser = true;
      finish();
    }
  }

}

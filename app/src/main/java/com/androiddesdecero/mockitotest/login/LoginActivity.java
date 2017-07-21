package com.androiddesdecero.mockitotest.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.androiddesdecero.mockitotest.R;
import com.androiddesdecero.mockitotest.finalactivity.FinalActivity;

public class LoginActivity extends AppCompatActivity implements Login.View {
    private EditText user,pass;
    private Login.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText)findViewById(R.id.edUser);
        pass = (EditText)findViewById(R.id.edPass);
        presenter = new LoginPresenter(this);
    }

    @Override
    public void usarioValido() {
        startActivity(new Intent(LoginActivity.this, FinalActivity.class));
    }

    @Override
    public void error() {
        Toast.makeText(this, "Usuario no es Valido", Toast.LENGTH_SHORT).show();
    }

    @Override
    public String getUserName() {
        return user.getText().toString();
    }

    @Override
    public String getPassword() {
        return pass.getText().toString();
    }
}

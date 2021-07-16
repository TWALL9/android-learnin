package com.example.loginboi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        EditText user = (EditText) findViewById(R.id.userEditText);
        EditText pass = (EditText) findViewById(R.id.passEditText);
        Log.i("login", "logged in");
        Toast.makeText(this, "creds: " + user.getText().toString() + "," + pass.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
package com.example.picon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText _usr, _pwd;
    Button _btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _pwd = findViewById(R.id.pwd);
        _usr = findViewById(R.id.usr);
        _btnLogin = findViewById(R.id.btnLogin);

        _btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // user account credentials username then password
                if (_usr.getText().toString().equals("user1") && _pwd.getText().toString().equals("userpass1")) {
                    Intent intent = new Intent(MainActivity.this, page.class);
                    startActivity(intent);

                } else if (_usr.getText().toString().equals("user2") && _pwd.getText().toString().equals("userpass2")) {
                    Intent intent = new Intent(MainActivity.this, page.class);
                    startActivity(intent);

                } else if (_usr.getText().toString().equals("user3") && _pwd.getText().toString().equals("userpass3")) {
                    Intent intent = new Intent(MainActivity.this, page.class);
                    startActivity(intent);

                } else if (_usr.getText().toString().equals("user4") && _pwd.getText().toString().equals("userpass4")) {
                    Intent intent = new Intent(MainActivity.this, page.class);
                    startActivity(intent);

                } else if (_usr.getText().toString().equals("user5") && _pwd.getText().toString().equals("userpass5")) {
                    Intent intent = new Intent(MainActivity.this, page.class);
                    startActivity(intent);

                } else if (_usr.getText().toString().equals("user6") && _pwd.getText().toString().equals("userpass6")) {
                    Intent intent = new Intent(MainActivity.this, page.class);
                    startActivity(intent);

                    // when user credentials are entered in incorrectly
                } else {
                    Toast.makeText(getApplicationContext(), "Login Incorrect", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
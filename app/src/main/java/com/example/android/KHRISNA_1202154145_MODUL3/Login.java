package com.example.android.KHRISNA_1202154145_MODUL3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);
    }

    public void onLogin(View view) {
        if (username.getText().toString().equals("khrisna") && password.getText().toString().equals("khrisna")){
            Toast.makeText(getApplicationContext(),"LOGIN Berhasil", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(),"LOGIN Gagal", Toast.LENGTH_SHORT).show();
        }
    }
}

package com.karsang.foodmandu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText etemail;
    private EditText etpswd;
    private Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etemail=findViewById(R.id.etemail);
        etpswd=findViewById(R.id.etpswd);
        btnlogin=findViewById(R.id.btnlogin);
    }
}

package com.example.sjcet.login_page;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
    }

    public void login(View view){
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if(username.equals("Noor")&& password.equals("Noor123")){
            Toast.makeText(this,"Login successful",Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this,"Invalid credentials",Toast.LENGTH_SHORT).show();
        }
    }
}

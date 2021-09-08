package com.example.medicinemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLogin, btnCreateAccount;
    EditText txtUsername, txtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDatabase myDatabase = new MyDatabase(this);
        SQLiteDatabase sqLiteDatabase = myDatabase.getWritableDatabase();
        myDatabase.onCreate(sqLiteDatabase);

        btnLogin = findViewById(R.id.login);
        btnCreateAccount = findViewById(R.id.createAccount);

        txtUsername = findViewById(R.id.username);
        txtPassword = findViewById(R.id.password);
        
        btnLogin.setOnClickListener(this);
        btnCreateAccount.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View view) {
        String username = txtUsername.getText().toString();
        String password = txtPassword.getText().toString();
        if (view.getId() == R.id.login){
            Toast.makeText(this, "Username: " + username + " Password " + password, Toast.LENGTH_SHORT).show();
        }
        if (view.getId() == R.id.createAccount){
            Toast.makeText(this, "Sign up", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this,signup.class);
            startActivity(intent);
        }
    }
}
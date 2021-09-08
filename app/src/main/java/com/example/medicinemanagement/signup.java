package com.example.medicinemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity implements View.OnClickListener {
    Button btnSignup;
    EditText txtFirstName, txtLastName, txtUsername, txtEmail, txtPassword, txtConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btnSignup = findViewById(R.id.signup);

        txtFirstName = findViewById(R.id.firstName);
        txtLastName = findViewById(R.id.lastname);
        txtUsername = findViewById(R.id.username);
        txtEmail = findViewById(R.id.email);
        txtPassword = findViewById(R.id.password);
        txtConfirmPassword = findViewById(R.id.confirmPassword);

        btnSignup.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String firstName = txtFirstName.getText().toString();
        String lastName = txtLastName.getText().toString();
        String username = txtUsername.getText().toString();
        String email = txtEmail.getText().toString();
        String password = txtPassword.getText().toString();
        String confirmPassword = txtConfirmPassword.getText().toString();
        if (view.getId() == R.id.signup){
            Toast.makeText(this,  firstName+lastName+username+email+password+confirmPassword, Toast.LENGTH_LONG).show();
        }
    }
}
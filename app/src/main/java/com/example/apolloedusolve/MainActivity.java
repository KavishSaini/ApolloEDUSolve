package com.example.apolloedusolve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void employeeRegister(View view){
        Intent intent = new Intent(this, EmployeeRegisterActivity.class);
        startActivity(intent);
    }

    public void businessRegister(View view){

    }
}
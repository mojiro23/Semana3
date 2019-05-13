package com.example.semana3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.semana3.Fragments.MainFragment;
import com.example.semana3.Fragments.SecondFragment;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_form);
        getSupportFragmentManager().beginTransaction().add(android.R.id.content, new SecondFragment()).commit();
    }
}

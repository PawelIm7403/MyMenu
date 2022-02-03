package com.example.mymenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button graj = (Button) findViewById(R.id.button);
        Button ranking = (Button) findViewById(R.id.button2);
        Button ustawienia = (Button) findViewById(R.id.button3);
        Button wyjscie = (Button) findViewById(R.id.button4);

    }

}
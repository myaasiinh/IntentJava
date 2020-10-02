package com.example.multipleactivitydanintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;
    private Object Intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btnhalaman1);
        btn2 =  findViewById(R.id.btnhalaman2);


        // method for click button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  = new Intent(MainActivity.this,Activity1.class);
                startActivity((android.content.Intent) Intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  = new Intent(MainActivity.this,Activity2.class);
                startActivity((android.content.Intent) Intent);
            }
        });
    }
}
package com.example.multipleactivitydanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    Button btnback2;
    private Object Intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btnback2 = findViewById(R.id.backbtnactivity2);
        btnback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  = new Intent(Activity2.this,MainActivity.class);
                startActivity((android.content.Intent) Intent);
            }
        });

    }

}
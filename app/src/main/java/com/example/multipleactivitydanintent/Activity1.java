package com.example.multipleactivitydanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {
    Button btnback1;
    private Object Intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        btnback1 = findViewById(R.id.btnbackactivity1);
        btnback1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  = new Intent(Activity1.this,MainActivity.class);
                startActivity((android.content.Intent) Intent);
            }
        });
    }
}
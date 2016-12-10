package com.example.aluno.resource;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        Intent intent = getIntent();

        Log.d("Gustavo", intent.getStringExtra("hello"));

        String cor = intent.getStringExtra("my_color");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.color_activity);
        linearLayout.setBackgroundColor(Color.parseColor(cor));


        Button buttonBack = (Button) findViewById(R.id.btn_back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                finish();
            }
        });


    }
}

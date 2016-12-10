package com.example.aluno.resource;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edShow = (EditText) findViewById(R.id.text_color);

        Button buttonNext = (Button) findViewById(R.id.btn_red);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ColorActivity.class);
                intent.putExtra("hello", "Oi Gustavo");
                String text = edShow.getText().toString();
                intent.putExtra("my_color", "#"+text);
                startActivity(intent);
            }
        });
    }
}

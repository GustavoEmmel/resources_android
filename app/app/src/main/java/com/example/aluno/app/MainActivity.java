package com.example.aluno.app;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvHello = (TextView) findViewById(R.id.tv_hello);
        String hello = getResources().getString(R.string.hello_world);

        Log.d("Gustavo", "create");

        tvHello.setText(hello);

        ImageView imageView = (ImageView)findViewById(R.id.iv_image);
        Drawable champ = getResources().getDrawable(R.drawable.campeao);

        imageView.setImageDrawable(champ);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Gustavo", "start");


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Gustavo", "resume");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("Gustavo", "pause");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("Gustavo", "stop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("Gustavo", "destroy");

    }
}

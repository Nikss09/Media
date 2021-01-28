package com.example.media;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void fade(View view)
    {
            ImageView img1 = (ImageView) findViewById(R.id.imageView1);
            ImageView img2 = (ImageView) findViewById(R.id.imageView2);

            img1.animate().scaleX(0.5f).scaleY(0.5f).setDuration(3000);
            //img1.animate().alpha(0).setDuration(3000);
            //img1.animate().translationXBy(-1000).setDuration(3000);
            //img1.animate().rotation(180).setDuration(3000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img1 = (ImageView) findViewById(R.id.imageView1);
        img1.setX(-1000);

        img1.animate().translationXBy(1000).rotation(3600).setDuration(3000);

    }
}
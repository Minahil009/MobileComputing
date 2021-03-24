package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView=findViewById(R.id.imageView);
    }

    public void animation(View view) {
        //imageView.animate().alpha(0).setDuration(2000);

        //imageView.animate().translationYBy(500).setDuration(2000);
        //imageView.animate().translationXBy(-500).setDuration(500);

        //2circles commpleted on 720
        //imageView.animate().rotation(720).setDuration(2000);

        //to disappear slightly after rotation
        //imageView.animate().rotation(720).alpha(0).setDuration(2000);

        //imageView.animate().scaleX(0.5f);
        //imageView.animate().scaleY(0.5f);

        //it will zoom in
        //imageView.animate().scaleY(0.5f).scaleX(0.5f).setDuration(2000);

        //it rotate 2 times with zoom in
        imageView.animate().rotation(720).scaleY(0.5f).scaleX(0.5f).setDuration(2000);
    }
}
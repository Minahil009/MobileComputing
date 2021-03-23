package com.example.adapterarray;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textView=findViewById(R.id.NameClicked);

        Intent intent=getIntent();
        Log.d("Checking", intent.getStringExtra("Friend Name"));
        textView.setText(intent.getStringExtra("Friend Name"));
    }
}
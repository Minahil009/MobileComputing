package com.example.android4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    Button button;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button=findViewById(R.id.buttonCount );
        textview=findViewById(R.id.textViewCounter );
        Log.d("ALC3", "onCreate called");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("ALC3", "onStart called");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("ALC3", "onResume called");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("ALC3", "onPause called");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("ALC3", "onStop called");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("ALC3", "onDestroy called");
    }


    public void moveActivity2(View view) {
        Intent intent=new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void moveActivityMain(View view) {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
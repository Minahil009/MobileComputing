package com.example.android4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button button;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button=findViewById(R.id.buttonCount );
        textview=findViewById(R.id.textViewCounter );
        Log.d("ALC2", "onCreate called");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("ALC2", "onStart called");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("ALC2", "onResume called");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("ALC2", "onPause called");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("ALC2", "onStop called");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("ALC2", "onDestroy called");
    }

    public void moveActivityMain(View view) {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void moveActivity3(View view) {
        Intent intent=new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}
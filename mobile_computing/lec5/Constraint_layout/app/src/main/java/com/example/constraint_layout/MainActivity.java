package com.example.constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.btn4);
        textview=findViewById(R.id.textView);
    }
    public void showInTextView(View view)
    {
        textview.setText("you clicked on button 4");
    }


    public void next_page(View view)
    {
        startActivity(new Intent(getApplicationContext(), MainActivity3.class));
    }
}
package com.example.adapterarray;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Button button;
    EditText editText;
    ArrayList<String> friendArrayList;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.Listview);
        button=findViewById(R.id.add_btn);
        editText=findViewById(R.id.inputName);
        //String [] friendList={"Burhan","Minahil","Asad","Maryam","Tayyab"};

        friendArrayList=new ArrayList<String>();
        friendArrayList.add("Burhan");
        friendArrayList.add("Minahil");
        friendArrayList.add("Asad");
        friendArrayList.add("Maryam");
        friendArrayList.add("Tayyab");

        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, friendArrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("you Clicked", friendArrayList.get(position));

                Intent intent=new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("Friend Name", friendArrayList.get(position));
                startActivity(intent);
            }
        });
    }

    public void add_button(View view)
    {
        friendArrayList.add(editText.getText().toString());
        //listView.setAdapter(arrayAdapter);
        arrayAdapter.notifyDataSetChanged();
        //to sort
        Collections.sort(friendArrayList);
    }
}
package com.example.drawernavigation;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dl = (DrawerLayout)findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl,R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv = (NavigationView)findViewById(R.id.nav_view);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {
                    case R.id.nav_book:
                        Toast.makeText(MainActivity.this, "My Account",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_chrome_reader:
                        Toast.makeText(MainActivity.this, "Settings",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_controller_view_tag:
                        Toast.makeText(MainActivity.this, "My Cart",Toast.LENGTH_SHORT).show();break;
                    default:
                        return true;
                }


                return true;

            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }
}






    /*NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;

    @Override

    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);

            Toast.makeText(getApplicationContext(), "Start", Toast.LENGTH_LONG).show();

        } else {

            Toast.makeText(getApplicationContext(), "End", Toast.LENGTH_LONG).show();

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.Toolbar);
        setSupportActionBar(toolbar);

        navigationView = findViewById(R.id.nav_view);
        drawerLayout = findViewById(R.id.nav_view);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.nav_book:

                        Toast.makeText(getApplicationContext(), "book is Cucked", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(MainActivity.this, BookActivity.class);

                        startActivity(intent);

                        break;

                    case R.id.nav_return:

                        Toast.makeText(getApplicationContext(), "Return is Clicked", Toast.LENGTH_LONG).show();

                        break;

                    case R.id.nav_chrome_reader:

                        Toast.makeText(getApplicationContext(), "Chrome reader is clicked", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);

                        break;

                    case R.id.nav_read_more:

                        Toast.makeText(getApplicationContext(), "Read More is clicked", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);

                        break;

                    case R.id.nav_add_comment:
                        Toast.makeText(getApplicationContext(), "Add_comment clicked", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);

                        break;
                }
                return true;

            }

        });
    }
}*/







package com.example.android.appportfolio.app;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String THIS_BUTTON_WILL_LAUNCH_MY_POPULAR_MOVIES_PROJECT = "This button will launch my popular movies project";
    public static final String THIS_BUTTON_WILL_LAUNCH_MY_STOCK_HAWK_PROJECT = "This button will launch my stock hawk project";
    public static final String THIS_BUTTON_WILL_LAUNCH_MY_BUILD_IT_BIGGER_PROJECT = "This button will launch my build it bigger project";
    public static final String THIS_BUTTON_WILL_LAUNCH_MY_MAKE_YOUR_APP_MATERIAL_PROJECT = "This button will launch my make your app material project";
    public static final String THIS_BUTTON_WILL_LAUNCH_MY_GO_UBIQUITOUS_PROJECT = "This button will launch my go ubiquitous project";
    public static final String THIS_BUTTON_WILL_LAUNCH_MY_CAPSTONE_PROJECT = "This button will launch my capstone project";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(Color.BLACK);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendCapstoneMessage(View v)
    {
        Toast.makeText(this, THIS_BUTTON_WILL_LAUNCH_MY_CAPSTONE_PROJECT, Toast.LENGTH_SHORT).show();
    }

    public void sendPopularMoviesMessage(View v)
    {
        Toast.makeText(this, THIS_BUTTON_WILL_LAUNCH_MY_POPULAR_MOVIES_PROJECT, Toast.LENGTH_SHORT).show();
    }

    public void sendStockHawkMessage(View v)
    {
        Toast.makeText(this, THIS_BUTTON_WILL_LAUNCH_MY_STOCK_HAWK_PROJECT, Toast.LENGTH_SHORT).show();
    }

    public void sendBuildItBiggerMessage(View v)
    {
        Toast.makeText(this, THIS_BUTTON_WILL_LAUNCH_MY_BUILD_IT_BIGGER_PROJECT, Toast.LENGTH_SHORT).show();
    }

    public void sendMakeAppMaterialMessage(View v)
    {
        Toast.makeText(this, THIS_BUTTON_WILL_LAUNCH_MY_MAKE_YOUR_APP_MATERIAL_PROJECT, Toast.LENGTH_SHORT).show();
    }

    public void sendGoUbiquitousMessage(View v)
    {
        Toast.makeText(this, THIS_BUTTON_WILL_LAUNCH_MY_GO_UBIQUITOUS_PROJECT, Toast.LENGTH_SHORT).show();
    }
}

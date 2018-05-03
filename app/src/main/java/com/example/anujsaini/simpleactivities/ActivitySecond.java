package com.example.anujsaini.simpleactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ActivitySecond extends AppCompatActivity {

    TextView tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_name = (TextView) findViewById(R.id.tv_display);
        // Receive the data sent from main activity. below written lines i.e. 19 and 20 do the same work.
        String name = this.getIntent().getStringExtra("name");
        //String name = this.getIntent().getExtras().getString("name");

        // set the data to TextView
        tv_name.setText("Welcome " + name + ".");
    }
}

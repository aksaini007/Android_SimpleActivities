package com.example.anujsaini.simpleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {

    EditText userName;
    Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = (EditText) findViewById(R.id.et_name);
        btnOK = (Button) findViewById(R.id.btn_next);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // You can use any of if statement.
                // if (userName.getText().toString().trim().equals("")){
                if (userName.getText().toString().trim().isEmpty()){
                    Toast.makeText(ActivityMain.this, "Name can't be blank.", Toast.LENGTH_LONG).show();
                    return;
                }
                else {
                    Intent intent = new Intent(ActivityMain.this, ActivitySecond.class);

                    // Data can be sent to new activity in many ways. Here we send the static data.
                    // intent.putExtra("name", "Anuj Saini");
                    // intent.putExtra("name", userName.getText().toString() );

                    // We use bundle to send bulk data.
                    Bundle bundle = new Bundle();
                    bundle.putString("name", userName.getText().toString());
                    intent.putExtras(bundle);
                    startActivity(intent);

                }
            }
        });
    }
}

package com.example.svilupposw.loginscreen;

import android.Manifest;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView email;
    TextView name;
    TextView info;
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        email = (TextView) findViewById(R.id.email);
        name = (TextView) findViewById(R.id.name);
        info = (TextView) findViewById(R.id.info);

        sharedpreferences = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);

        email.setText(sharedpreferences.getString("email",null));
        name.setText(sharedpreferences.getString("name",null));
        info.setText(sharedpreferences.getString("info",null));
        /*buttonCall = (Button) findViewById(R.id.buttoncall);
        number = (EditText) findViewById(R.id.editText);
        String username;

        txview = (TextView) findViewById(R.id.textView2);

        Intent intent = getIntent();

        username = intent.getStringExtra("user");
        if (username != null) {
            txview.setText("Ciao " + username + " !");
        } else {
            txview.setText("Non funziona!");
        }*/

        /*buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number.getText().toString().trim().length() == 0) {
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.error_call), Toast.LENGTH_SHORT).show();
                } else {
                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                    phoneIntent.setData(Uri.parse(number.getText().toString()));

                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.calling), Toast.LENGTH_SHORT).show();

                    try{
                        startActivity(phoneIntent);
                    }

                    catch (android.content.ActivityNotFoundException ex){
                        Toast.makeText(getApplicationContext(),getResources().getString(R.string.error_call2),Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });*/

    }
}

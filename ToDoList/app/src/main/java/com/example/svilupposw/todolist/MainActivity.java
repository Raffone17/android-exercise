package com.example.svilupposw.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    Firebase alanRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Firebase alanRef = MyApplication.getMyFirebaseRef().child("users");
        User alan = new User("Alan Turing", 1912);
        alanRef.setValue(alan);
    }
}

package com.example.svilupposw.todolist;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by svilupposw on 31/03/16.
 */
public class MyApplication extends Application {

    private static final String FIREBASE_URL = "https://sizzling-fire-3411.firebaseio.com/";
    private static Firebase myFirebaseRef;
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
        myFirebaseRef = new Firebase(FIREBASE_URL);
    }
    public static Firebase getMyFirebaseRef() {
        return myFirebaseRef;
    }


}

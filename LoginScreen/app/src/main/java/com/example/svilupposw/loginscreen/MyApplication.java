package com.example.svilupposw.loginscreen;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by svilupposw on 14/03/16.
 */
public class MyApplication extends Application {

    private String email="bella@email.com";

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences(
                getString(R.string.preference_file_key), Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("email",email);
        editor.putInt("eta",26);
        editor.commit();

    }
}

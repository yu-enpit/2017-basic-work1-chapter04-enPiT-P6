package com.example.u90684.janken;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//起動時にデータをクリアする。
        SharedPreferences pref =
                PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.commit();
    }
    public void onJanKenButtonTapped(View view){
        Intent intent = new Intent(this,ResultActivity.class);
        int id = intent.getIntExtra("MY_HAND",view.getId());
        intent.putExtra("MY_HAND",view.getId());
        startActivity(intent);
    }
}

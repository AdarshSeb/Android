package com.example.alcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("alcapp","onCreate()");
    }
    @Override
    public  void onStart(){
        super.onStart();
        Log.d("alcapp","onStart()");

    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d("alcapp","onStop()");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("alcapp","onDestroy()");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d("alcapp","onResume()");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d("alcapp","onPause()");
    }
}
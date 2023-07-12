package com.example.interestcal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View v){
        EditText e1 = (EditText) findViewById(R.id.et1);
        EditText e2 = (EditText) findViewById(R.id.et2);
        EditText e3 = (EditText) findViewById(R.id.et3);
        int a,i,y;

        a = Integer.parseInt(e1.getText().toString());
        i = Integer.parseInt(e2.getText().toString());
        y = Integer.parseInt(e3.getText().toString());
        for(int j=1;j<=y;j++){
            
        }
    }
}
package com.example.cbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2;
    EditText t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = (CheckBox) findViewById(R.id.c1);
        c2 = (CheckBox) findViewById(R.id.c2);
        t1 = (EditText) findViewById(R.id.t1);
    }
    public void onselect(View v){
        String str = "";
        if(c1.isChecked())
            str = "ug";
        if(c2.isChecked())
            str = str+"pg";
        t1.setText(str);
    }
    public void onpg(View v){
        if(c2.isChecked())
            c1.setChecked(true);
        else
            c1.setChecked(false);
    }
}
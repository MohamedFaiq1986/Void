package com.mohammed.avoid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Stt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stt);
    }
    public void go(View v){
        Intent intent=new Intent(Stt.this,TimeVoid.class);
        startActivity(intent);
    }
    public void goTime(View v){
        Intent intent=new Intent(Stt.this,Time.class);
        startActivity(intent);
    }
    public void goF(View v){
        Intent intent=new Intent(Stt.this,MainActivity.class);
        startActivity(intent);
    }
    public void goDate(View v){
        Intent intent=new Intent(Stt.this,Date.class);
        startActivity(intent);
    }
    public void off(View v){
        System.exit(0);
    }

}

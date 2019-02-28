package com.mohammed.avoid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TimeVoid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_void);
    }
    public void go(View v){
        Intent intent=new Intent(TimeVoid.this,Stt.class);
        startActivity(intent);
    }
}

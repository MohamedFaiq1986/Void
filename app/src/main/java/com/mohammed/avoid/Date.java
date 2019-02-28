package com.mohammed.avoid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Date extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

    }
    public void gotostt(View v){
        Intent intent=new Intent(Date.this,Stt.class);
        startActivity(intent);

    }
}

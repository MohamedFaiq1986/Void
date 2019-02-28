package com.mohammed.avoid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup g;
    RadioButton radioButton,radioButton2;
    Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        g=(RadioGroup)findViewById(R.id.gr);


    }

    public void onclickbuttonMethod(View v) {
        int selectedId = g.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(selectedId);
        if (selectedId == -1) {
            Toast.makeText(MainActivity.this, "no select", Toast.LENGTH_SHORT).show();


        } else {
            Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
        }
        Intent intent=new Intent(MainActivity.this,Id.class);
        startActivity(intent);
    }
    public void goStt(View v){
        Intent intent=new Intent(MainActivity.this,Stt.class);
        startActivity(intent);

    }
}
package com.mohammed.avoid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Info extends AppCompatActivity {
    Button button12;

    TextView textInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        button12 = (Button) findViewById(R.id.button12);
        textInfo = (TextView) findViewById(R.id.textInfo);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            StringBuffer result = new StringBuffer();
            result.append("\n" + extras.getString("Id"));
            result.append("\n" + extras.getString("Name"));
            result.append("\n" + extras.getString("الحاله"));
            textInfo.setText(result);
        }

    }
    public void Fin(View v){
        Intent intent=new Intent(Info.this,MainActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(Info.this, "شكرا على استخدام", Toast.LENGTH_SHORT).show();
    }
}

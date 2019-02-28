package com.mohammed.avoid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Fniger extends AppCompatActivity {
    EditText editText;
    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fniger);
        editText=(EditText)findViewById(R.id.editText);
        button6=(Button)findViewById(R.id.button6);
    }
public void goId(View v){
    Intent intent=new Intent(Fniger.this,Id.class);
    startActivity(intent);
}
    public void goToInfo(View v){

        Intent intent=new Intent(Fniger.this,Info.class);
        intent.putExtra("Id","123456");
        intent.putExtra("Name","محمد");
        intent.putExtra("الحاله","تم التصويت");
        startActivity(intent);
    }

}

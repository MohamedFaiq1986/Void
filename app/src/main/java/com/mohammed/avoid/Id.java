package com.mohammed.avoid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Id extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    String[] country={"بغداد_الكرخ","ديالى","صلاح الدين","الانبار","بغداد_الرصافه","بابل","كركوك","السليمانيه","دهوك","اربيل","موصل","البصره","النجف","كربلاء","المثنى","ميسان"};
    TextView textView8;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id);
        textView8=(TextView)findViewById(R.id.textView8);
        Spinner spin=(Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        aa.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spin.setAdapter(aa);
        editText=(EditText)findViewById(R.id.editText);
    }
    public void goF(View v){
        Intent intent=new Intent(Id.this,MainActivity.class);
        startActivity(intent);
    }
    public void goFin(View v){

        String a;
        a="123456";
        if(a.equals(editText.getText().toString())) {
            Intent intent = new Intent(Id.this, Fniger.class);
            startActivity(intent);
        }
        else {
            textView8.setText("رقم الناخب خطا");

        }
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // Toast.makeText(getApplicationContext(),country[position],Toast.LENGTH_LONG).show();
        textView8.setText(country[position]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(Id.this, "يرجى ادخال البصمه", Toast.LENGTH_SHORT).show();
    }
}

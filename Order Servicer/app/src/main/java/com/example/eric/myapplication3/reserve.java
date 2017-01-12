package com.example.eric.myapplication3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class reserve extends AppCompatActivity {

    EditText name;
    EditText phone;
    EditText people;

    Button reserve_confirm;
    Button reserve_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve);

        name = (EditText)findViewById(R.id.name);
        phone = (EditText)findViewById(R.id.phone);
        people = (EditText)findViewById(R.id.people);
        reserve_confirm = (Button)findViewById(R.id.reserve_confirm);
        reserve_cancel = (Button)findViewById(R.id.reserve_cancel);

        reserve_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp_name = name.getText().toString();
                String tmp_phone = phone.getText().toString();
                String tmp_people = people.getText().toString();

                Intent i = new Intent();
                Bundle b = new Bundle();
                b.putString("na", tmp_name);
                b.putString("ph", tmp_phone);
                b.putString("pe", tmp_people);
                i.putExtras(b);
                setResult(100,i);
                finish();
            }
        });
        reserve_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(reserve.this, MainActivity3.class);
                setResult(101,i);
                finish();
            }
        });


    }
}

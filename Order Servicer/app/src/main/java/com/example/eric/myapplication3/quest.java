package com.example.eric.myapplication3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class quest extends AppCompatActivity {

    Button confirm;
    Button cancel;

    TextView tab1;
    TextView tab2;
    TextView tab3;
    TextView tab4;
    TextView tab5;
    TextView tab6;
    TextView tab7;
    TextView tab8;
    TextView print;

    EditText editText;

    //int table=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest);
        editText = (EditText)findViewById(R.id.editText);

        confirm = (Button)findViewById(R.id.confirm);
        cancel = (Button)findViewById(R.id.cancel);
        //clear = (Button)findViewById(R.id.clear);

        tab1 = (TextView)findViewById(R.id.tab1);
        tab2 = (TextView)findViewById(R.id.tab2);
        tab3 = (TextView)findViewById(R.id.tab3);
        tab4 = (TextView)findViewById(R.id.tab4);
        tab5 = (TextView)findViewById(R.id.tab5);
        tab6 = (TextView)findViewById(R.id.tab6);
        tab7 = (TextView)findViewById(R.id.tab7);
        tab8 = (TextView)findViewById(R.id.tab8);
        print = (TextView)findViewById(R.id.print);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        //table=bundle.getInt("table_num");
        print.setText(bundle.getString("mealed"));



        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = editText.getText().toString();

                Intent i = new Intent();
                Bundle b = new Bundle();
                b.putString("meal", tmp);
                i.putExtras(b);
                //i.setClass(quest.this, MainActivity3.class);
                setResult(105,i);
                finish();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(quest.this, MainActivity3.class);
                setResult(101,i);
                finish();
            }
        });
    }
}

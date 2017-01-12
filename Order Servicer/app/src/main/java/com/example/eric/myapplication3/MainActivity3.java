package com.example.eric.myapplication3;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.eric.myapplication3.R;

public class MainActivity3 extends AppCompatActivity {

    Button table1;
    Button table2;
    Button table3;
    Button table4;
    Button table5;
    Button table6;
    Button table7;
    Button table8;

    int table=0;
    int reset=0;
    String[] meal = new String[]{"","","","","","","","","",""};

    //int function=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        table1 = (Button)findViewById(R.id.table1);
        table2 = (Button)findViewById(R.id.table2);
        table3 = (Button)findViewById(R.id.table3);
        table4 = (Button)findViewById(R.id.table4);
        table5 = (Button)findViewById(R.id.table5);
        table6 = (Button)findViewById(R.id.table6);
        table7 = (Button)findViewById(R.id.table7);
        table8 = (Button)findViewById(R.id.table8);

        table1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                table=1;
                reset=0;
                chose_function();
            }
        });
        table2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                table=2;
                reset=0;
                chose_function();
            }
        });
        table3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                table=3;
                reset=0;
                chose_function();
            }
        });
        table4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                table=4;
                reset=0;
                chose_function();
            }
        });
        table5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                table=5;
                reset=0;
                chose_function();
            }
        });
        table6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                table=6;
                reset=0;
                chose_function();
            }
        });
        table7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                table=7;
                reset=0;
                chose_function();
            }
        });
        table8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                table=8;
                reset=0;
                chose_function();
            }
        });
    }
    public void chose_function(){
        final String[] list_item = {"點餐", "訂位", "取消訂位/翻桌", "取消"};
        AlertDialog.Builder dialog_list = new AlertDialog.Builder(MainActivity3.this);
        dialog_list.setTitle("功能選擇");
        dialog_list.setItems(list_item, new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int function){
                if(function==0){
                    Intent i = new Intent();
                    i.setClass(MainActivity3.this, quest.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("table_num", table);
                    bundle.putString("mealed", meal[table]);
                    i.putExtras(bundle);
                    startActivityForResult(i, table);
                }
                if(function==1){
                    Intent i = new Intent();
                    i.setClass(MainActivity3.this, reserve.class);
                    startActivityForResult(i, table);
                }
                if(function==2){
                    /*int reset=1;
                    Intent i = new Intent();
                    i.setClass(MainActivity3.this, quest.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("reset", reset);
                    bundle.putInt("table_num", table);
                    startActivityForResult(i, table);*/

                    switch (table){
                        case 1:
                            table1.setText("1桌\n有空位");
                            meal[1]="";
                            Toast.makeText(MainActivity3.this, "已清空" + table + "桌", Toast.LENGTH_SHORT).show();
                            break;
                        case 2:
                            table2.setText("2桌\n有空位");
                            meal[2]="";
                            Toast.makeText(MainActivity3.this, "已清空" + table + "桌", Toast.LENGTH_SHORT).show();
                            break;
                        case 3:
                            table3.setText("3桌\n有空位");
                            meal[3]="";
                            Toast.makeText(MainActivity3.this, "已清空" + table + "桌", Toast.LENGTH_SHORT).show();
                            break;
                        case 4:
                            table4.setText("4桌\n有空位");
                            meal[4]="";
                            Toast.makeText(MainActivity3.this, "已清空" + table + "桌", Toast.LENGTH_SHORT).show();
                            break;
                        case 5:
                            table5.setText("5桌\n有空位");
                            meal[5]="";
                            Toast.makeText(MainActivity3.this, "已清空" + table + "桌", Toast.LENGTH_SHORT).show();
                            break;
                        case 6:
                            table6.setText("6桌\n有空位");
                            meal[6]="";
                            Toast.makeText(MainActivity3.this, "已清空" + table + "桌", Toast.LENGTH_SHORT).show();
                            break;
                        case 7:
                            table7.setText("7桌\n有空位");
                            meal[7]="";
                            Toast.makeText(MainActivity3.this, "已清空" + table + "桌", Toast.LENGTH_SHORT).show();
                            break;
                        case 8:
                            table8.setText("8桌\n有空位");
                            meal[8]="";
                            Toast.makeText(MainActivity3.this, "已清空" + table + "桌", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
                if(function==3){
                    Toast.makeText(MainActivity3.this, "已取消選擇", Toast.LENGTH_SHORT).show();
                }
            }
        });
        dialog_list.show();
    }

    protected void onActivityResult(int requsetCode, int resultCode, Intent data){
        if(resultCode==100){
            Bundle b = data.getExtras();
            String str1 = b.getString("na");
            String str2 = b.getString("ph");
            String str3 = b.getString("pe");
            switch (table) {
                case 1:
                    table1.setText("1桌(已訂位)\n" + str1 + "\n" + str2 + "\n" + str3+"人");
                    break;
                case 2:
                    table2.setText("2桌(已訂位)\n" + str1 + "\n" + str2 + "\n" + str3+"人");
                    break;
                case 3:
                    table3.setText("3桌(已訂位)\n" + str1 + "\n" + str2 + "\n" + str3+"人");
                    break;
                case 4:
                    table4.setText("4桌(已訂位)\n" + str1 + "\n" + str2 + "\n" + str3+"人");
                    break;
                case 5:
                    table5.setText("5桌(已訂位)\n" + str1 + "\n" + str2 + "\n" + str3+"人");
                    break;
                case 6:
                    table6.setText("6桌(已訂位)\n" + str1 + "\n" + str2 + "\n" + str3+"人");
                    break;
                case 7:
                    table7.setText("7桌(已訂位)\n" + str1 + "\n" + str2 + "\n" + str3+"人");
                    break;
                case 8:
                    table8.setText("8桌(已訂位)\n" + str1 + "\n" + str2 + "\n" + str3+"人");
                    break;
            }
        }
        if(resultCode==105){
            Bundle b = data.getExtras();
            meal[table] = b.getString("meal");
            switch (table){
                case 1:
                    table1.setText("1桌\n用餐中");
                    break;
                case 2:
                    table2.setText("2桌\n用餐中");
                    break;
                case 3:
                    table3.setText("3桌\n用餐中");
                    break;
                case 4:
                    table4.setText("4桌\n用餐中");
                    break;
                case 5:
                    table5.setText("5桌\n用餐中");
                    break;
                case 6:
                    table6.setText("6桌\n用餐中");
                    break;
                case 7:
                    table7.setText("7桌\n用餐中");
                    break;
                case 8:
                    table8.setText("8桌\n用餐中");
                    break;
            }

        }
    }
}

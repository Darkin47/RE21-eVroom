package com.example.administrator.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;



public class Activity_content_event extends ActionBarActivity {

   Button btn;
   Button list;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_event);

        list = (Button) findViewById(R.id.listparti);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Activity_content_event.this, Activity_listparti.class);
                startActivity(it);}
        });

        btn = (Button) findViewById(R.id.rejoindre);
        btn.setOnClickListener(listener);
    }



    private View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //按了button按钮以后，让他弹出一个对话框
                new AlertDialog.Builder(Activity_content_event.this)
                        .setTitle(R.string.title_name)
                        .setMessage(R.string.message_name)
                        .setPositiveButton(R.string.btn1_name, new android.content.DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                // TODO Auto-generated method stub
                                arg0.dismiss();
                            }
                        })
                        .show();
            }
        };





}

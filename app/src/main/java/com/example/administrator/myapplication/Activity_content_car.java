package com.example.administrator.myapplication;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class Activity_content_car extends ActionBarActivity {
    Button contact;
    Button cocar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_car);

        contact = (Button) findViewById(R.id.contact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Activity_content_car.this, Activity_chat.class);
                startActivity(it);}
        });

        cocar = (Button) findViewById(R.id.cocar);
        cocar.setOnClickListener(listener);
    }



    private View.OnClickListener listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            //按了button按钮以后，让他弹出一个对话框
            new AlertDialog.Builder(Activity_content_car.this)
                    .setTitle(R.string.title_name)
                    .setMessage(R.string.message_name1)
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
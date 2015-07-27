package com.example.administrator.myapplication;



import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

public class Activity_creat extends ActionBarActivity {
    private Button btn;
    private Button cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creat);
        cancel = (Button) findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_creat.this, Activity_hello.class);
                startActivity(intent);}
        });
        btn = (Button) findViewById(R.id.creat);
        btn.setOnClickListener(mylistener);
    }

    private OnClickListener mylistener = new OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            //按了button按钮以后，让他弹出一个对话框
            new AlertDialog.Builder(Activity_creat.this)
                    .setTitle(R.string.title_name)
                    .setMessage(R.string.message_name)
                    .setPositiveButton(R.string.btn1_name, new android.content.DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {
                            // TODO Auto-generated method stub
                            arg0.dismiss();
                            Intent it = new Intent(Activity_creat.this, Activity_hello.class);
                            startActivity(it); //这里跳转到你想要去的页面
                        }
                    })
                    .show();
        }
    };


}
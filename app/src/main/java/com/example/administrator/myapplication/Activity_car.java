package com.example.administrator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.support.v7.app.ActionBarActivity;


public class Activity_car extends ActionBarActivity {
    Button btn;
    Button ajoute;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car);

        btn = (Button) findViewById(R.id.Text1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Activity_car.this, Activity_content_car.class);
                startActivity(it);}
        });





    }




}
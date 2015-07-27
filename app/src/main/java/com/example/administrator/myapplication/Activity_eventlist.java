package com.example.administrator.myapplication;


import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View;

public class Activity_eventlist extends ActionBarActivity {
    Button event1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_list);

    event1 = (Button) findViewById(R.id.Text1);
    event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Activity_eventlist.this, Activity_content_event.class);
                startActivity(it);}
    });



    }
}

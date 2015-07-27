package com.example.administrator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Activity_friends extends ActionBarActivity {

        Button chatter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends);

        chatter = (Button) findViewById(R.id.julien);
        chatter.setOnClickListener(new ImageButton.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
          Intent intent = new Intent(Activity_friends.this, Activity_chat.class);
          startActivity(intent);
                                       }
                                   }
        );

    }
}

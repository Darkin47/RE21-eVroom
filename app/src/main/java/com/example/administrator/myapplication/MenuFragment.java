package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;




public class MenuFragment extends Fragment implements View.OnClickListener {
    ImageButton event;
    ImageButton chat;
    ImageButton car;
    ImageButton map;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_menu, container, false);

        event = (ImageButton) view.findViewById(R.id.eventButton);
        event.setOnClickListener(this);

        chat = (ImageButton) view.findViewById(R.id.chatButton);
        chat.setOnClickListener(this);


        car = (ImageButton) view.findViewById(R.id.carButton);
        car.setOnClickListener(this);

        map = (ImageButton) view.findViewById(R.id.mapButton);
        map.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {
        view.getId();
        switch (view.getId())
        {
            case R.id.eventButton:
                Intent it1 = new Intent(this.getActivity(), Activity_eventlist.class);
                this.startActivity(it1);
                break;
            case R.id.chatButton:
                Intent it2 = new Intent(this.getActivity(), Activity_friends.class);
                this.startActivity(it2);
                break;
            case R.id.mapButton:
                Intent it3 = new Intent(this.getActivity(), Activity_map.class);
                this.startActivity(it3);
                break;
            case R.id.carButton:
                Intent it4 = new Intent(this.getActivity(), Activity_car.class);
                this.startActivity(it4);
                break;
        }

    }
}

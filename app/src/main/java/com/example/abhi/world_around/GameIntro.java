package com.example.abhi.world_around;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.abhi.world_around.GameHome;
import com.example.abhi.world_around.R;

public class GameIntro extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_intro);

        Button play_button = (Button)findViewById(R.id.button);
        play_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GameIntro.this, GameHome.class);
                startActivity(i);
            }
        });

    }}

package com.example.abhi.world_around;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_home);
        final Button fruitsGame = (Button) findViewById(R.id.fruitsGame);
        fruitsGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fruits = new Intent(GameHome.this, Fruits.class);
                //int counterfruits;
               // Fruits currentselection = new Fruits();
                //int[] data = new int[10];
               // for (counterfruits=0;counterfruits<10;counterfruits++){
                    startActivity(fruits);
            }
        });

        final Button vegetablesGame = (Button) findViewById(R.id.vegetablesGame);
        vegetablesGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GameHome.this, Vegetables.class);
                startActivity(i);
            }
        });

        final Button TransportationGame = (Button) findViewById(R.id.transportGame);
        TransportationGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GameHome.this, Transport.class);
                startActivity(i);
            }
        });

        final Button BodyPartsGame = (Button) findViewById(R.id.bodyGame);
        BodyPartsGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GameHome.this, BodyParts.class);
                startActivity(i);
            }
        });

    }



}

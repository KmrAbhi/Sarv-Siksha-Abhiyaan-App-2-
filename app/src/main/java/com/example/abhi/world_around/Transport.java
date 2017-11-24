package com.example.abhi.world_around;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.example.abhi.world_around.R.id.image;

public class Transport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        final ImageView image=(ImageView) findViewById(R.id.image);
        final int[] images = new int[10];
        final String[] imagename = new String[10];
        images[0] = R.drawable.airplane;
        images[1] = R.drawable.autorickshaw;
        images[2] = R.drawable.bicycle;
        images[3] = R.drawable.submarine;
        images[4] = R.drawable.ship;
        images[5] = R.drawable.motorcycle;
        images[6] = R.drawable.bus;
        images[7] = R.drawable.train;
        images[8] = R.drawable.car;
        images[9] = R.drawable.helicopter;
        imagename[0] = "Airplane";
        imagename[1] = "Auto-Rickshaw";
        imagename[2] = "Bicycle";
        imagename[3] = "Submarine";
        imagename[4] = "Ship";
        imagename[5] = "Motorcycle";
        imagename[6] = "Bus";
        imagename[7] = "Train";
        imagename[8] = "Car";
        imagename[9] = "Helicopter";
        final Button option1 = (Button) findViewById(R.id.option1);
        final Button option2 = (Button) findViewById(R.id.option2);
        final Button option3 = (Button) findViewById(R.id.option3);
        final Button option4 = (Button) findViewById(R.id.option4);


        final Random rng = new Random(System.currentTimeMillis());
        final List<Integer> k =new ArrayList<>();
        final int[] z=new int[1];
        z[0]=0;
        for (int i = 0; i < 10; i++) {
            while (true) {
                int next = (rng.nextInt(10));
                if (!k.contains(next)) {
                    k.add(next);
                    break;
                }
            }
        }

        final List<Integer> x = new ArrayList<>();
        x.add(k.get(z[0]));
        final Random rng1 = new Random(System.currentTimeMillis());
        for (int i = 0; i < 3; i++) {
            while (true) {
                int next = (rng1.nextInt(10));
                if (!x.contains(next)) {
                    x.add(next);
                    break;
                }
            }
        }


        final Random rng2 = new Random(System.currentTimeMillis());
        final List<Integer> y = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            while (true) {
                int next = (rng2.nextInt(4));
                if (!y.contains(next)) {
                    y.add(next);
                    break;
                }
            }
        }

        image.setImageResource(images[k.get(z[0])]);
        option1.setText(imagename[x.get(y.get(0))]);
        option2.setText(imagename[x.get(y.get(1))]);
        option3.setText(imagename[x.get(y.get(2))]);
        option4.setText(imagename[x.get(y.get(3))]);

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.custom_toast_container));
        final Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        final Intent getmenu=new Intent(Transport.this,GameHome.class);
        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imagename[k.get(z[0])] == imagename[x.get(y.get(0))]) {
                    z[0]++;
                    if(z[0]<10){
                        x.clear();
                        y.clear();
                        x.add(k.get(z[0]));
                        for (int i = 0; i < 3; i++) {
                            while (true) {
                                int next = (rng1.nextInt(10));
                                if (!x.contains(next)) {
                                    x.add(next);
                                    break;
                                }
                            }
                        }
                        for (int i = 0; i < 4; i++) {
                            while (true) {
                                int next = (rng2.nextInt(4));
                                if (!y.contains(next)) {
                                    y.add(next);
                                    break;
                                }
                            }
                        }
                        image.setImageResource(images[k.get(z[0])]);
                        option1.setText(imagename[x.get(y.get(0))]);
                        option2.setText(imagename[x.get(y.get(1))]);
                        option3.setText(imagename[x.get(y.get(2))]);
                        option4.setText(imagename[x.get(y.get(3))]);


                    }
                    else{
                        finish();
                        startActivity(getmenu);
                    }}
                else {
                    toast.show();
                }
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imagename[k.get(z[0])] == imagename[x.get(y.get(1))]) {
                    z[0]++;
                    if(z[0]<10){
                        x.clear();
                        y.clear();
                        x.add(k.get(z[0]));
                        for (int i = 0; i < 3; i++) {
                            while (true) {
                                int next = (rng1.nextInt(10));
                                if (!x.contains(next)) {
                                    x.add(next);
                                    break;
                                }
                            }
                        }
                        for (int i = 0; i < 4; i++) {
                            while (true) {
                                int next = (rng2.nextInt(4));
                                if (!y.contains(next)) {
                                    y.add(next);
                                    break;
                                }
                            }
                        }
                        image.setImageResource(images[k.get(z[0])]);
                        option1.setText(imagename[x.get(y.get(0))]);
                        option2.setText(imagename[x.get(y.get(1))]);
                        option3.setText(imagename[x.get(y.get(2))]);
                        option4.setText(imagename[x.get(y.get(3))]);



                    }else{
                        finish();
                        startActivity(getmenu);
                    }}
                else {
                    toast.show();
                }
            }
        });


        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imagename[k.get(z[0])] == imagename[x.get(y.get(2))]) {
                    z[0]++;
                    if(z[0]<10){
                        x.clear();
                        y.clear();
                        x.add(k.get(z[0]));
                        for (int i = 0; i < 3; i++) {
                            while (true) {
                                int next = (rng1.nextInt(10));
                                if (!x.contains(next)) {
                                    x.add(next);
                                    break;
                                }
                            }
                        }
                        for (int i = 0; i < 4; i++) {
                            while (true) {
                                int next = (rng2.nextInt(4));
                                if (!y.contains(next)) {
                                    y.add(next);
                                    break;
                                }
                            }
                        }
                        image.setImageResource(images[k.get(z[0])]);
                        option1.setText(imagename[x.get(y.get(0))]);
                        option2.setText(imagename[x.get(y.get(1))]);
                        option3.setText(imagename[x.get(y.get(2))]);
                        option4.setText(imagename[x.get(y.get(3))]);




                    }
                    else{
                        finish();
                        startActivity(getmenu);
                    }}
                else {
                    toast.show();
                }
            }
        });
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imagename[k.get(z[0])] == imagename[x.get(y.get(3))]) {
                    z[0]++;
                    if(z[0]<10){
                        x.clear();
                        y.clear();
                        x.add(k.get(z[0]));
                        for (int i = 0; i < 3; i++) {
                            while (true) {
                                int next = (rng1.nextInt(10));
                                if (!x.contains(next)) {
                                    x.add(next);
                                    break;
                                }
                            }
                        }
                        for (int i = 0; i < 4; i++) {
                            while (true) {
                                int next = (rng2.nextInt(4));
                                if (!y.contains(next)) {
                                    y.add(next);
                                    break;
                                }
                            }
                        }
                        image.setImageResource(images[k.get(z[0])]);
                        option1.setText(imagename[x.get(y.get(0))]);
                        option2.setText(imagename[x.get(y.get(1))]);
                        option3.setText(imagename[x.get(y.get(2))]);
                        option4.setText(imagename[x.get(y.get(3))]);


                    }
                    else{
                        finish();
                        startActivity(getmenu);
                    }}
                else {
                    toast.show();
                }
            }
        });
    }
}

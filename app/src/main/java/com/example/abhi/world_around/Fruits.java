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

public class Fruits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        final ImageView image=(ImageView) findViewById(R.id.image);
        final int[] images = new int[10];
        final String[] imagename = new String[10];
        images[0] = R.drawable.pineapple;
        images[1] = R.drawable.orange;
        images[2] = R.drawable.grapes;
        images[3] = R.drawable.strawberry;
        images[4] = R.drawable.banana;
        images[5] = R.drawable.apple;
        images[6] = R.drawable.pear;
        images[7] = R.drawable.papaya;
        images[8] = R.drawable.mango;
        images[9] = R.drawable.watermelon;
        imagename[0] = "Pineapple";
        imagename[1] = "Orange";
        imagename[2] = "Grapes";
        imagename[3] = "Strawberry";
        imagename[4] = "Banana";
        imagename[5] = "Apple";
        imagename[6] = "Pear";
        imagename[7] = "Papaya";
        imagename[8] = "Mango";
        imagename[9] = "Watermelon";
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
        final Intent getmenu=new Intent(Fruits.this,GameHome.class);
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

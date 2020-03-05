package com.example.potato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    CheckBox c1;
    CheckBox c2;
    CheckBox c3;
    CheckBox c4;
    CheckBox c5;
    CheckBox c6;
    CheckBox c7;
    CheckBox c8;
    CheckBox c9;
    CheckBox c10;
    ImageView arms;ImageView ears;ImageView eyebrows;ImageView eyes;
    ImageView glasses;ImageView hat;ImageView mouth;ImageView mustache;ImageView nose;ImageView shoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.arms_cb);
        c2 = findViewById(R.id.ears_cb);
        c3 =findViewById(R.id.eyebrows_cb);
        c4 = findViewById(R.id.eyes_cb);
        c5 = findViewById(R.id.glasses_cb);
        c6 = findViewById(R.id.hat_cb);
        c7 = findViewById(R.id.mouth_cb);
        c8 = findViewById(R.id.mustache_cb);
        c9 = findViewById(R.id.nose_cb);
        c10 = findViewById(R.id.shoes_cb);
        arms = findViewById(R.id.arms);ears= findViewById(R.id.ears);eyebrows = findViewById(R.id.eyebrows);
        eyes = findViewById(R.id.eyes);glasses = findViewById(R.id.glasses);hat = findViewById(R.id.hat);
        mouth = findViewById(R.id.mouth);mustache = findViewById(R.id.mustache);nose = findViewById(R.id.nose);
        shoes  = findViewById(R.id.shoes);

        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked){
                    arms.setVisibility(View.VISIBLE);
                }
                else{
                    arms.setVisibility(View.INVISIBLE);
                }

            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked){
                    ears.setVisibility(View.VISIBLE);
                }
                else{
                    ears.setVisibility(View.INVISIBLE);
                }
            }
        });
        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked){
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else{
                    eyebrows.setVisibility(View.INVISIBLE);
                }
            }
        });
        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked){
                    eyes.setVisibility(View.VISIBLE);
                }
                else{
                    eyes.setVisibility(View.INVISIBLE);
                }
            }
        });
        c5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked){
                    glasses.setVisibility(View.VISIBLE);
                }
                else{
                    glasses.setVisibility(View.INVISIBLE);
                }
            }
        });
        c6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked){
                    hat.setVisibility(View.VISIBLE);
                }
                else{
                    hat.setVisibility(View.INVISIBLE);
                }
            }
        });
        c7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked){
                    mouth.setVisibility(View.VISIBLE);
                }
                else{
                    mouth.setVisibility(View.INVISIBLE);
                }
            }
        });
        c8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked){
                    mustache.setVisibility(View.VISIBLE);
                }
                else{
                    mustache.setVisibility(View.INVISIBLE);
                }
            }
        });
        c9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked){
                    nose.setVisibility(View.VISIBLE);
                }
                else{
                    nose.setVisibility(View.INVISIBLE);
                }
            }
        });
        c10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked){
                    shoes.setVisibility(View.VISIBLE);
                }
                else{
                    shoes.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

}





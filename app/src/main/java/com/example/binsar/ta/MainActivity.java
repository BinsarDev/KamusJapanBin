package com.example.binsar.ta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imageView1 = (ImageView)findViewById(R.id.btn_cari_kata);
        ImageView imageView2 = (ImageView)findViewById(R.id.btn_percakapan);
        ImageView imageView3 = (ImageView)findViewById(R.id.btn_kana);
        ImageView imageView4 = (ImageView)findViewById(R.id.btn_tata);
        ImageView imageView5 = (ImageView)findViewById(R.id.btn_kanji);
        ImageView imageView6 = (ImageView)findViewById(R.id.btn_tentang);



        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent capcus = new Intent(MainActivity.this,CariKata.class);
                startActivity(capcus);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent capcus2 = new Intent(MainActivity.this,Percakapan.class);
                startActivity(capcus2);
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent capcus3 = new Intent(MainActivity.this,Kana.class);
                startActivity(capcus3);
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent capcus4 = new Intent(MainActivity.this,TataBahasa.class);
                startActivity(capcus4);
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent capcus5 = new Intent(MainActivity.this,Kanji.class);
                startActivity(capcus5);
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent capcus6 = new Intent(MainActivity.this,Tentang.class);
                startActivity(capcus6);
            }
        });
    }
}

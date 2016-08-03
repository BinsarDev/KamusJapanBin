package com.example.binsar.ta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CariKata extends AppCompatActivity {

    private ListView mListview;
    private KamusBaseAdapter mAdapter;
    private ArrayList<Kamus> mDataset;

    private EditText mCari;
    private DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari_kata);

        db = new DBHelper(this);

        mDataset = new ArrayList<>();
        mAdapter = new KamusBaseAdapter(this, mDataset);

        mListview = (ListView) findViewById(R.id.cari_kata_listview);
        mListview.setAdapter(mAdapter);

        mCari = (EditText) findViewById(R.id.cari_kata_cari);
        mCari.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
               mDataset =  db.getAllKamus(mCari.getText().toString(), true);
               mAdapter.swapData(mDataset);
            }
        });
    }
}

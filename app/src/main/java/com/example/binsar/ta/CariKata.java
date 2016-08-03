package com.example.binsar.ta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ListView;

import com.example.binsar.ta.adapter.KamusBaseAdapter;
import com.example.binsar.ta.model.Kamus;

import java.util.ArrayList;

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

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
               mDataset =  db.getAllKamus(mCari.getText().toString(), getIntent().getBooleanExtra("reverse", true));
               mAdapter.swapData(mDataset);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

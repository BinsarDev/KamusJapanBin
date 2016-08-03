package com.example.binsar.ta.page;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.binsar.ta.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class KanaFragment extends Fragment {


    public KanaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_kana, container, false);
        return v;
    }

}

package com.example.binsar.ta.page;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.binsar.ta.CariKata;
import com.example.binsar.ta.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CariFragment extends Fragment {


    public CariFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_cari, container, false);

        Button indoJpn = (Button) v.findViewById(R.id.btn_indo_jpn);
        Button jpnIndo = (Button) v.findViewById(R.id.btn_jpn_indo);

        indoJpn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), CariKata.class);
                in.putExtra("reverse", true);
                getActivity().startActivity(in);
            }
        });

        jpnIndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), CariKata.class);
                in.putExtra("reverse", false);
                getActivity().startActivity(in);
            }
        });

        return v;
    }



}

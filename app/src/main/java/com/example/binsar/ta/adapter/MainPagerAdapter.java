package com.example.binsar.ta.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.binsar.ta.page.CariFragment;
import com.example.binsar.ta.page.KanaFragment;
import com.example.binsar.ta.page.KanjiFragment;
import com.example.binsar.ta.page.TataBahasaFragment;
import com.example.binsar.ta.page.TentangFragment;

/**
 * Created by Zund#i on 03/08/2016.
 */
public class MainPagerAdapter extends FragmentPagerAdapter {

    private int PAGE_COUNT = 5;
    private String[] title = new String[] {"Cari Kata", "Huruf Kana", "Tata Bahasa", "huruf Kanji", "Tentang"};

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        Fragment page = null;

        switch (position) {
            case 0 :
                page = new CariFragment();  break;
            case 1 :
                page = new KanaFragment();  break;
            case 2 :
                page = new TataBahasaFragment(); break;
            case 3 :
                page = new KanjiFragment(); break;
            case 4 :
                page = new TentangFragment(); break;
            default :
                page = new CariFragment();
        }

        return page;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}

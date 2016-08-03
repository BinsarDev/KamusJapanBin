package com.example.binsar.ta;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.security.PublicKey;
import java.util.ArrayList;

/**
 * Created by Binsar on 7/23/2016.
 */
public class KamusBaseAdapter extends BaseAdapter {

    private ArrayList<Kamus> mDataset;
    private Activity mActivity;
    private LayoutInflater inflater;

    public KamusBaseAdapter(Activity mActivity, ArrayList<Kamus> mDataset) {
        this.mActivity = mActivity;
        this.mDataset = mDataset;
        this.inflater = LayoutInflater.from(mActivity);
    }
    @Override
    public int getCount() {
        return mDataset.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder mViewHolder;

        if (convertView == null){
            convertView = inflater.inflate(R.layout.item_kamus, parent ,false);
            mViewHolder = new ViewHolder(convertView);
            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }

        Kamus item = mDataset.get(position);

        mViewHolder.itemKamusText1.setText(item.kata);
        mViewHolder.itemKamusText2.setText(item.translasi);
        mViewHolder.itemKamusText3.setText(item.kata_jepang);

        return convertView;
    }

    public void swapData(ArrayList<Kamus> mDataset) {
        this.mDataset = mDataset;
        notifyDataSetChanged();
    }

    static class ViewHolder {
        TextView itemKamusText1;
        TextView itemKamusText2;
        TextView itemKamusText3;

        public ViewHolder(View item) {
            itemKamusText1 = (TextView) item.findViewById(R.id.item_kamus1);
            itemKamusText2 = (TextView) item.findViewById(R.id.item_kamus2);
            itemKamusText3 = (TextView) item.findViewById(R.id.item_kamus3);
        }
    }
}

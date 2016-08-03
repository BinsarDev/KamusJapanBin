package com.example.binsar.ta;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.binsar.ta.model.Kamus;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;

/**
 * Created by Binsar on 7/23/2016.
 */
public class DBHelper extends SQLiteAssetHelper {

    private  static final String DATABASE_NAME = "kamus.db";

    public static final String
                kamus_jepang = "kamus_jepang",
                kata = "kata",
                translasi = "translasi",
                kata_jepang = "kata_jepang",
                kanji_jepang = "kanji_jepang",
                pengucapan_jepang = "pengucapan_jepang";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    public ArrayList<Kamus> getAllKamus(String kata, boolean reverse) {
        SQLiteDatabase db = this.getWritableDatabase();
        ArrayList<Kamus> mDataset = new ArrayList<>();
        String field = reverse ? "kata" : "kata_jepang";

        Cursor c = db.rawQuery("select * from "+kamus_jepang+" where "+field+" like '"+kata+"%'" , null);

        if (c.moveToFirst()) {
            do {
                Kamus item = new Kamus(
                        c.getInt(c.getColumnIndex("_id")),
                        c.getString(c.getColumnIndex("kata")),
                        c.getString(c.getColumnIndex("translasi")),
                        c.getString(c.getColumnIndex("kata_jepang")),
                        c.getString(c.getColumnIndex("kanji_jepang")),
                        c.getString(c.getColumnIndex("pengucapan_jepang")),
                        c.getString(c.getColumnIndex("keyword_jepang"))
                );
                mDataset.add(item);
            } while (c.moveToNext());
        }
        db.close();
        return mDataset;
    }
}

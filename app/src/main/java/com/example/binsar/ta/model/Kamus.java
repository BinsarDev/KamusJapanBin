package com.example.binsar.ta.model;

/**
 * Created by Binsar on 7/23/2016.
 */
public class Kamus {
    public int id;
    public String kata;
    public String translasi;
    public String kata_jepang;
    public String kanji_jepang;
    public String pengucapan_jepang;
    public String keyword_jepang;

    public Kamus(int id, String kata,String translasi ,String kata_jepang ,String kanji_jepang ,String pengucapan_jepang ,String keyword_jepang) {
        this.id = id;
        this.kata = kata;
        this.translasi = translasi;
        this.kata_jepang = kata_jepang;
        this.kanji_jepang = kanji_jepang;
        this.pengucapan_jepang = pengucapan_jepang;
        this.keyword_jepang = keyword_jepang;
    }
}

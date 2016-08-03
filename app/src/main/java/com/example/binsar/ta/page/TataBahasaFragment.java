package com.example.binsar.ta.page;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.binsar.ta.R;
import com.example.binsar.ta.ActivityWebView;

/**
 * A simple {@link Fragment} subclass.
 */
public class TataBahasaFragment extends Fragment {

    String [] menu = {
            "1. Perkenalan",
            "2. Pola Kalimat WA",
            "3. Partikel MO",
            "4. Belajar Huruf Hiragana",
            "5. Hiragana No Kakikata",
            "6. Aisatsu atau Ucapan Salam",
            "7. Belajar Huruf Katakana",
            "8. Katakana No Kakikata",
            "9. Seputar Kanji",
            "10. Kata Tunjuk Benda",
            "11. Penggunaan Kata Tanya Pada Kata Tunjuk",
            "12. Partikel No",
            "13. Kata Tunjuk Benda: Kono,Sono,Ano",
            "14. Kata Tunjuk Tempat Koko Soko Asoko",
            "15. Kata Tunjuk Tempat Kochira Sochira Achira",
            "16. Fungsi Partikel NO",
            "17. Belajar Angka Jepang",
            "18. Menanyakan Harga",
            "19. Menyatakan Waktu",
            "20. Pada Jam Berapa",
            "21. Dari Kapan Sampai Kapan",
            "22. Menyatakan Waktu Lampau",
            "23. Pergi Kemana",
            "24. Pergi Ke Sekolah Menggunakan Apa",
            "25. Dengan Siapa",
            "26. Partikel WO",
            "27. Beli Dimana",
            "28. Kalimat Ajakan",
            "29. Mengunakan Apa",
            "30. Memberi Dan Menerima",
            "31. i-Kyoushi",
            "32. Kata Sifat",
            "33. Kata Sifat AKhiran -NA",
            "34. Kata Sifat Bahasa Jepang Lebih Lanjut",
            "35. Partikel GA",
            "36. Antara Dan Tiada",
            "37. Antara Dan Tiada - Part 2",
            "38. Josuushi",
            "39. Menyatakan Perbandingan",
            "40. Mana Yang Lebih . . . . ,",
            "41. Menyatakan Paling",
            "42. Kata Kerja Bahasa Jepang",
            "43. Kata Kerja Bentuk -MASU",
            "44. Perubahan Kata Kerja Bentuk -MASU",
            "45. Menyatakan Keinginan Kata Benda",
            "46. Menyatakan Keinginan Kata Kerja",
            "47. Pergi Untuk Kembali",
            "48. Kata Kerja Bentuk -tte",
            "49. Kata Kerja Bentuk Perintah",
            "50. Kata Kerja Bentuk Langsung",
            "51. Kata Kerja Bntuk Perizinan",
            "52. Menyambung Kata Kerja Dalam Satu Kalimat"


    };

    String [] html = {
            "1.html",
            "2.html",
            "3.html",
            "4.html",
            "5.html",
            "6.html",
            "7.html",
            "8.html",
            "9.html",
            "10.html",
            "11.html",
            "12.html",
            "13.html",
            "14.html",
            "15.html",
            "16.html",
            "17.html",
            "18.html",
            "19.html",
            "20.html",
            "21.html",
            "22.html",
            "23.html",
            "24.html",
            "25.html",
            "26.html",
            "27.html",
            "28.html",
            "29.html",
            "30.html",
            "31.html",
            "32.html",
            "33.html",
            "34.html",
            "35.html",
            "36.html",
            "37.html",
            "38.html",
            "39.html",
            "40.html",
            "41.html",
            "42.html",
            "43.html",
            "44.html",
            "45.html",
            "46.html",
            "47.html",
            "48.html",
            "49.html",
            "50.html",
            "51.html",
            "52.html"

    };

    public TataBahasaFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tata_bahasa, container, false);

        ListView listView = (ListView) v.findViewById(R.id.tata_bahasa_list);
        listView.setAdapter(new ArrayAdapter<>(getActivity(), R.layout.icon, R.id.icon2, menu));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(), ActivityWebView.class);
                i.putExtra("html", html[position]);
                startActivity(i);
            }
        });

        return v;
    }

}

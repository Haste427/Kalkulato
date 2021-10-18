package com.dikyhadhi.kalkulatorluaskeliling;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class KetigaFragment extends Fragment {
    private Button btnHasil;
    private EditText jari_jari;
    private TextView hslluas,hslkeliling;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_ketiga, container, false);
        btnHasil = v.findViewById(R.id.btnHasil);
        jari_jari = v.findViewById(R.id.jari_jari);
        hslluas = v.findViewById(R.id.hslluas);
        hslkeliling = v.findViewById(R.id.hslkeliling);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = jari_jari.getText().toString();
                if (nilai.isEmpty()){
                    jari_jari.setError("Data Tidak Boleh Kosong");
                    jari_jari.requestFocus();
                }else {
                    Double angka = Double.parseDouble(nilai);
                    Double luas = 3.14 * (angka *2);
                    Double keliling = 2 * 3.14 * angka;
                    hslluas.setText(String.format("%.2f", luas));
                    hslkeliling.setText(String.format("%.2f", keliling));
                }
            }
        });

        return v;
    }
}
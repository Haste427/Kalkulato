package com.dikyhadhi.kalkulatorluaskeliling;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PertamaFragment extends Fragment {
    private Button btnHasil;
    private EditText panjang,lebar;
    private TextView hslluas,hslkeliling;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_pertama, container, false);
        btnHasil = v.findViewById(R.id.btnHasil);
        panjang = v.findViewById(R.id.panjang);
        lebar = v.findViewById(R.id.lebar);
        hslluas = v.findViewById(R.id.hslluas);
        hslkeliling = v.findViewById(R.id.hslkeliling);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = panjang.getText().toString();
                String nilai2 = lebar.getText().toString();

                if (nilai1.isEmpty()){
                    panjang.setError("Data Tidak Boleh Kosong");
                    panjang.requestFocus();
                }else if (nilai2.isEmpty()){
                    lebar.setError("Data Tidak Boleh Kosong");
                    lebar.requestFocus();
                }else {
                    Integer panjang =Integer.parseInt(nilai1);
                    Integer lebar =Integer.parseInt(nilai2);

                    Integer luas = panjang * lebar;
                    Integer keliling = 2*(panjang+lebar);
                    hslluas.setText(String.valueOf(luas));
                    hslkeliling.setText(String.valueOf(keliling));

                }
            }
        });

        return v;
    }
}
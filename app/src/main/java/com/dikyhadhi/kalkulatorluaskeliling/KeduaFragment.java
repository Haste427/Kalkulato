package com.dikyhadhi.kalkulatorluaskeliling;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KeduaFragment extends Fragment {
    private EditText alas,tinggi;
    private Button btn_hasil;
    private TextView hslluas,hslkeliling;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_kedua, container, false);

        btn_hasil = v.findViewById(R.id.btn_hasil);
        alas = v.findViewById(R.id.alas);
        tinggi = v.findViewById(R.id.tinggi);
        hslluas = v.findViewById(R.id.hslluas);
        hslkeliling = v.findViewById(R.id.hslkeliling);

        btn_hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = alas.getText().toString();
                String nilai2 = tinggi.getText().toString();

                if (nilai1.isEmpty()){
                    alas.setError("Data Tidak Boleh Kosong");
                    alas.requestFocus();
                }else if (nilai2.isEmpty()){
                    tinggi.setError("Data Tidak Boleh Kosong");
                    tinggi.requestFocus();
                }else {
                    Double ala = Double.parseDouble(nilai1);
                    Double tingg = Double.parseDouble(nilai2);

                    Double luas = 0.5 * ala * tingg;
                    Double keliling = (2*ala)+tingg;
                    hslluas.setText(String.format("%.2f", luas));
                    hslkeliling.setText(String.format("%.2f", keliling));

                }
            }
        });

        return v;
    }
}
package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvnama, tvnomor;

    String nama;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        Bundle b = getIntent().getExtras();
        nama = b.getString("a");

        tvnama = (TextView) findViewById(R.id.tvNamaKontak);
        tvnomor = (TextView) findViewById(R.id.tvNomorTelepon);

        switch (nama){
            case "Inayah":
                tvnama.setText("Inayah M");
                tvnomor.setText("08122233344");
                break;
            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomor.setText("08132345333");
                break;
            case "Eris":
                tvnama.setText("Eris J");
                tvnomor.setText("08363681292");
                break;
            case  "Fikri":
                tvnama.setText("M Fikri");
                tvnomor.setText("08123563272");
                break;
            case "Maul":
                tvnama.setText("Maul M");
                tvnomor.setText("0812374736384");
                break;
            case "Intan":
                tvnama.setText("Intan S");
                tvnomor.setText("0812383462891");
                break;
            case "Vina":
                tvnama.setText("Vina S");
                tvnomor.setText("0822736129823");
                break;
            case "Gita":
                tvnama.setText("Gita S");
                tvnomor.setText("0828726728192");
                break;
            case "Lutfi":
                tvnama.setText("Lutfi M");
                tvnomor.setText("0812222232134");
                break;
            case "Vian":
                tvnama.setText("Vian M");
                tvnomor.setText("081218738291");
                break;
        }
    }
}
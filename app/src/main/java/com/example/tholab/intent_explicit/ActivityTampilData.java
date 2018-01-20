package com.example.tholab.intent_explicit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActivityTampilData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_data);

        Bundle b = getIntent().getExtras(); // menampung putExtras dari mainactivity

        //di definisikan terlebih dahulu
        TextView nama = findViewById(R.id.valueNama);
        TextView alamat = findViewById(R.id.valueAlamat);
        TextView umur = findViewById(R.id.valueUmur);
        TextView hp = findViewById(R.id.valueHp);
        TextView jeniskelamin = findViewById(R.id.jenisvalue);

        nama.setText(b.getCharSequence("Nama"));
        alamat.setText(b.getCharSequence("Alamat"));
        umur.setText(b.getCharSequence("Umur"));
        hp.setText(b.getCharSequence("No_Hp"));
        jeniskelamin.setText(b.getCharSequence("Jenis_Kelamin"));
    }
}

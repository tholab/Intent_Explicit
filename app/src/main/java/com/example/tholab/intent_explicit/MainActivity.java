package com.example.tholab.intent_explicit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    EditText nama;
    EditText alamat;
    EditText umur;
    EditText hp;
    RadioGroup jenisKelamin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findAllViewid();
        button.setOnClickListener(this);
    }

    private void findAllViewid() {
        button = findViewById(R.id.btnkirim);
        nama = findViewById(R.id.edtnama);
        alamat = findViewById(R.id.edtalamat);
        umur = findViewById(R.id.edtumur);
        hp = findViewById(R.id.edthp);
        jenisKelamin = findViewById(R.id.radio);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),ActivityTampilData.class);

        Bundle b = new Bundle(); // sebuah bungkusan yang bisa di edit
        b.putString("Nama",nama.getText().toString());
        b.putString("Alamat", alamat.getText().toString());
        b.putString("Umur", umur.getText().toString());
        b.putString("No_Hp", hp.getText().toString());

        //untuk pemanggilan radio Grup
        int id_jenis = jenisKelamin.getCheckedRadioButtonId();
        RadioButton radioButton = findViewById(id_jenis);
        b.putString("Jenis_Kelamin", radioButton.getText().toString());

        intent.putExtras(b);
        startActivity(intent);

    }
}

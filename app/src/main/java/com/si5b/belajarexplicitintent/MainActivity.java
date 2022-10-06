package com.si5b.belajarexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnPindah;
    EditText etnama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("layout A");

        btnPindah = findViewById(R.id.btn_pindah);
        etnama = findViewById(R.id.et_nama);

        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = etnama.getText().toString();

                if(nama.trim().equals("")){
                    etnama.setError("Nama Harus Diisi");
                }
                else{
                    Intent pindah = new Intent(MainActivity.this, secondActivity.class);
                    pindah.putExtra("xNama", nama);
                    startActivity(pindah);
                }
            }
        });

    }
}
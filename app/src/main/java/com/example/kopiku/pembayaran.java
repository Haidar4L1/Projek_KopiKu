package com.example.kopiku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class pembayaran extends AppCompatActivity {

    private CheckBox checkBox1, checkBox2, checkBoxTambah1, checkBoxTambah2;
    private Button buttonBayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pembayaran);

        checkBox1 = findViewById(R.id.checkBox11);
        checkBox2 = findViewById(R.id.checkBox22);
        checkBoxTambah1 = findViewById(R.id.checkBox11);
        checkBoxTambah2 = findViewById(R.id.checkBox22);
        buttonBayar = findViewById(R.id.button);

        //CheckBox 1
        checkBox1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(pembayaran.this, "add Americano with milk.", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(pembayaran.this, "remove coffee.", Toast.LENGTH_SHORT).show();
            }
        });

        //CheckBox 2
        checkBox2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(pembayaran.this, "add Americano (no Sugar).", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(pembayaran.this, "remove coffee.", Toast.LENGTH_SHORT).show();
            }
        });

        buttonBayar.setOnClickListener(view -> {
            Intent intent = new Intent(pembayaran.this, payment_done.class);
            startActivity(intent);
        });
    }

    private void prosesMetodePembayaran(String metodePembayaran) {
        Toast.makeText(this, metodePembayaran, Toast.LENGTH_SHORT).show();
    }
}

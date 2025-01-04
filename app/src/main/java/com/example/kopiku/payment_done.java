package com.example.kopiku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class payment_done extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_done);

        // Inisialisasi tombol
        Button buttonBackToHome = findViewById(R.id.buttonback);

        // Set onClickListener untuk kembali ke halaman utama
        buttonBackToHome.setOnClickListener(view -> {
            Intent intent = new Intent(payment_done.this, halaman_utama.class);
            startActivity(intent);
            finish(); // Opsional, tutup activity PaymentDone agar tidak kembali ke halaman ini
        });
    }
}

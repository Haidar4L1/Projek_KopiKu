package com.example.kopiku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class halaman_utama extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_utama);

        Button tambahButton = findViewById(R.id.btn_add);
        tambahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(halaman_utama.this, pembayaran.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.tugas2login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityLayoutTB extends AppCompatActivity {

    Button scanraisa;
    Button masukreedem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_layout_tb);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        scanraisa = findViewById(R.id.btnscanbarcode);

        scanraisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scanbotol = new Intent(ActivityLayoutTB.this, ScanTutupBotol.class);
                startActivity(scanbotol);
            }
        });

        masukreedem = findViewById(R.id.btnreedemvaganza);

        masukreedem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahreedem = new Intent(ActivityLayoutTB.this, ReedemVaganza.class);
                startActivity(pindahreedem);
            }
        });
    }
}
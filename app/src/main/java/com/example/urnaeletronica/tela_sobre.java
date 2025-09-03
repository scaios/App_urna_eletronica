package com.example.urnaeletronica;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class tela_sobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_sobre);

        Button btnFechar = findViewById(R.id.btnFecharSobre);
        btnFechar.setOnClickListener(v -> finish());
    }
}

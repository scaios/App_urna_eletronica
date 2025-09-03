package com.example.urnaeletronica;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int total = 0, fulano = 0, beltrano = 0, ciclano = 0, zoinho = 0, furunculo = 0, branco = 0, nulo = 0;

    TextView tvTotal, tvFulano, tvBeltrano, tvCiclano, tvZoinho, tvFurunculo, tvBranco, tvNulo,

    pcFulano, pcBeltrano, pcCiclano, pcZoinho, pcFurunculo, pcBranco, pcNulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTotal     = findViewById(R.id.tvTotal);
        tvFulano    = findViewById(R.id.tvFulano);
        tvBeltrano  = findViewById(R.id.tvBeltrano);
        tvCiclano   = findViewById(R.id.tvCiclano);
        tvZoinho    = findViewById(R.id.tvZoinho);
        tvFurunculo = findViewById(R.id.tvFurunculo);
        tvBranco    = findViewById(R.id.tvBranco);
        tvNulo      = findViewById(R.id.tvNulo);

        pcFulano    = findViewById(R.id.pcFulano);
        pcBeltrano  = findViewById(R.id.pcBeltrano);
        pcCiclano   = findViewById(R.id.pcCiclano);
        pcZoinho    = findViewById(R.id.pcZoinho);
        pcFurunculo = findViewById(R.id.pcFurunculo);
        pcBranco    = findViewById(R.id.pcBranco);
        pcNulo      = findViewById(R.id.pcNulo);

        Button btnFulano    = findViewById(R.id.btnFulano);
        Button btnBeltrano  = findViewById(R.id.btnBeltrano);
        Button btnCiclano   = findViewById(R.id.btnCiclano);
        Button btnZoinho    = findViewById(R.id.btnZoinho);
        Button btnFurunculo = findViewById(R.id.btnFurunculo);
        Button btnBranco    = findViewById(R.id.btnBranco);
        Button btnNulo      = findViewById(R.id.btnNulo);
        btnFulano.setOnClickListener(v -> { fulano++; total++; updateUI(); });
        btnBeltrano.setOnClickListener(v -> { beltrano++; total++; updateUI(); });
        btnCiclano.setOnClickListener(v -> { ciclano++; total++; updateUI(); });
        btnZoinho.setOnClickListener(v -> { zoinho++; total++; updateUI(); });
        btnFurunculo.setOnClickListener(v -> { furunculo++; total++; updateUI(); });
        btnBranco.setOnClickListener(v -> { branco++; total++; updateUI(); });
        btnNulo.setOnClickListener(v -> { nulo++; total++; updateUI(); });

        updateUI();
    }

    void updateUI() {
        // números
        tvTotal.setText(String.valueOf(total));
        tvFulano.setText(String.valueOf(fulano));
        tvBeltrano.setText(String.valueOf(beltrano));
        tvCiclano.setText(String.valueOf(ciclano));
        tvZoinho.setText(String.valueOf(zoinho));
        tvFurunculo.setText(String.valueOf(furunculo));
        tvBranco.setText(String.valueOf(branco));
        tvNulo.setText(String.valueOf(nulo));

        pcFulano.setText(formatPct(percent(fulano)));
        pcBeltrano.setText(formatPct(percent(beltrano)));
        pcCiclano.setText(formatPct(percent(ciclano)));
        pcZoinho.setText(formatPct(percent(zoinho)));
        pcFurunculo.setText(formatPct(percent(furunculo)));
        pcBranco.setText(formatPct(percent(branco)));
        pcNulo.setText(formatPct(percent(nulo)));
    }

    double percent(int valor) {
        if (total == 0) return 0.0;
        return (valor * 100.0) / total;
    }
    String formatPct(double v) {
        return String.format("%.2f%%", v);
    }
}

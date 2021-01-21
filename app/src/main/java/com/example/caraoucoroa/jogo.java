package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class jogo extends AppCompatActivity {
    private TextView resutado_jogo;
    private ImageView volta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        volta = findViewById(R.id.imageView);
        resutado_jogo = findViewById(R.id.is_resultado);
        String[] ResutadoDoaray = { "Cara", "Coroa"};
        int numeroAleatrotio = new  Random().nextInt(2);
        String fimResulktado = ResutadoDoaray[numeroAleatrotio];
        resutado_jogo.setText(fimResulktado);


    }

    public void volta (View view){

        Intent intent = new Intent(jogo.this, MainActivity.class);
        startActivity(intent);


    }
}

package com.example.intransit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Opcoes extends AppCompatActivity {
    private Button Para_Hist;
    private Button Para_Chat;
    private Button Para_Loc;
    private Button Sair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opcoes);

        Para_Hist = findViewById(R.id.Para_Hist);
        Para_Chat = findViewById(R.id.Para_Chat);
        Para_Loc = findViewById(R.id.Para_Loc);
        Sair = findViewById(R.id.Sair);


        Para_Hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Opcoes.this, Hist_Viagens.class);
                startActivity(intent);
                finish();
            }
        });
        Para_Chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Opcoes.this, Chat.class);
                startActivity(intent);
                finish();
            }
        });
        Para_Loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Opcoes.this, Localizacao.class);
                startActivity(intent);
                finish();
            }
        });
        Sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Opcoes.this, Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}


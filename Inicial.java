package com.example.intransit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Inicial extends AppCompatActivity {
        private Button Paralogin;
        private Button Paracadastro;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.inicial);

            Paralogin = findViewById(R.id.Paralogin);
            Paracadastro = findViewById(R.id.Paracadastro);

            Paralogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Inicial.this, Login.class);
                    startActivity(intent);
                    finish();
                }
            });
            Paracadastro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Inicial.this, Cadastro.class);
                    startActivity(intent);
                    finish();
                }
            });
        }
}

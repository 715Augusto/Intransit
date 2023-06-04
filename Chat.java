package com.example.intransit;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Chat extends AppCompatActivity {

    private TextView chat;
    private EditText menssagem;
    private Button enviar;
    private Button voltar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);

        chat = findViewById(R.id.chat);
        menssagem = findViewById(R.id.menssagem);
        enviar = findViewById(R.id.enviar);
        voltar4 = findViewById(R.id.voltar4);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = menssagem.getText().toString();
                appendMessageToChat(message);
                menssagem.setText("");
            }
        });
        voltar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chat.this, Opcoes.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void appendMessageToChat(String message) {
        String currentChat = chat.getText().toString();
        String newChat = currentChat + "\n" + message;
        chat.setText(newChat);
    }
}
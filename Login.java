package com.example.intransit;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    private EditText insert_usuario;
    private EditText insert_senha;
    private Button botao_de_login;
    private ProgressBar barra_de_carregamento;
    private CheckBox mostrar_senha;
    private Button botao_de_voltar;

    private static final String USUARIO_PADRAO = "admin";
    private static final String SENHA_PADRAO = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        insert_usuario = findViewById(R.id.insert_usuario);
        insert_senha = findViewById(R.id.insert_senha);
        botao_de_login = findViewById(R.id.botao_de_login);
        barra_de_carregamento = findViewById(R.id.barra_de_carregamento);
        mostrar_senha = findViewById(R.id.mostrar_senha);
        botao_de_voltar = findViewById(R.id.botao_de_voltar);

        botao_de_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String loginUsuario = insert_usuario.getText().toString();
                String loginSenha = insert_senha.getText().toString();

                if (!TextUtils.isEmpty(loginUsuario) && !TextUtils.isEmpty(loginSenha)) {
                    barra_de_carregamento.setVisibility(View.VISIBLE);

                    if (loginUsuario.equals(USUARIO_PADRAO) && loginSenha.equals(SENHA_PADRAO)) {
                        abrirTelaPrincipal();
                    } else {
                        Toast.makeText(Login.this, "Credenciais inválidas", Toast.LENGTH_SHORT).show();
                        barra_de_carregamento.setVisibility(View.INVISIBLE);
                    }
                } else {
                    Toast.makeText(Login.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mostrar_senha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    insert_senha.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    insert_senha.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

        botao_de_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Inicial.class);
                startActivity(intent);
                finish();
            }
        });
    }


    private void abrirTelaPrincipal() {
        Intent intent = new Intent(Login.this, Opcoes.class);
        startActivity(intent);
        finish();
    }
}
package com.example.intransit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Cadastro extends AppCompatActivity {

    private EditText nomeCompletoEditText;
    private EditText matriculaEditText;
    private EditText rgEditText;
    private EditText telefoneEditText;
    private EditText cepEditText;
    private EditText logradouroEditText;
    private EditText complementoEditText;
    private EditText instituicaoEditText;
    private EditText senhaEditText;
    private EditText confirmarSenhaEditText;
    private EditText codigoRotaEditText;
    private Button cadastrarButton;
    private Button voltar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        // Inicialize as views
        nomeCompletoEditText = findViewById(R.id.nome_completo);
        matriculaEditText = findViewById(R.id.cod_matricula);
        rgEditText = findViewById(R.id.rg);
        telefoneEditText = findViewById(R.id.numero_telefone);
        cepEditText = findViewById(R.id.editTextNumber5);
        logradouroEditText = findViewById(R.id.logradouro);
        complementoEditText = findViewById(R.id.complemento);
        instituicaoEditText = findViewById(R.id.instituicao);
        senhaEditText = findViewById(R.id.senha);
        confirmarSenhaEditText = findViewById(R.id.confirmar_senha);
        codigoRotaEditText = findViewById(R.id.codigo_rota);
        cadastrarButton = findViewById(R.id.button);
        voltar2 = findViewById(R.id.voltar2);

        // Configurar o evento de clique do botão
        cadastrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obter os valores inseridos nos campos de texto
                String nomeCompleto = nomeCompletoEditText.getText().toString();
                String matricula = matriculaEditText.getText().toString();
                String rg = rgEditText.getText().toString();
                String telefone = telefoneEditText.getText().toString();
                String cep = cepEditText.getText().toString();
                String logradouro = logradouroEditText.getText().toString();
                String complemento = complementoEditText.getText().toString();
                String instituicao = instituicaoEditText.getText().toString();
                String senha = senhaEditText.getText().toString();
                String confirmarSenha = confirmarSenhaEditText.getText().toString();
                String codigoRota = codigoRotaEditText.getText().toString();

                // Realizar a lógica de cadastro aqui, como salvar os dados em um banco de dados ou enviar para um servidor

                // Exemplo: Imprimir os valores no console
                System.out.println("Nome Completo: " + nomeCompleto);
                System.out.println("Matrícula: " + matricula);
                System.out.println("RG: " + rg);
                System.out.println("Telefone: " + telefone);
                System.out.println("CEP: " + cep);
                System.out.println("Logradouro: " + logradouro);
                System.out.println("Complemento: " + complemento);
                System.out.println("Instituição: " + instituicao);
                System.out.println("Senha: " + senha);
                System.out.println("Confirmar Senha: " + confirmarSenha);
                System.out.println("Código da Rota: " + codigoRota);
            }
        });
        voltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cadastro.this, Inicial.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

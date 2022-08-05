package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.biometrics.BiometricManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InnerActivity extends AppCompatActivity {
    // Declarar variáveis que irão receber xml
    EditText edtUsuario, edtSenha;
    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Abrir O Layout
        setContentView(R.layout.inner_layout);

        //Declarara as variaveis do java para receber as do xml, fazer uma ponte
        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtUsuario);
        btnEntrar = findViewById(R.id.btnEntrar);

        //Criando a ação do btnEntrar
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario, senha;

                usuario = edtUsuario.getText().toString();
                senha = edtSenha.getText().toString();

                //Validade a entrada do Usuario

                if (usuario.equals("Senac") && senha.equals("Senac")) {
                    //Abrindo outra janela
                    //Duas formas de abrir uma janela

                    //startActivity(new Intent(getApplicationContext(), MenuPrincipalActivity.class));
                } else {
                    Toast.makeText(InnerActivity.this, "Usuário ou senha inválidos", Toast.LENGTH_SHORT).show();
                    //chamando o método limpar janela
                    limparJanela();
                }

            }
        });

        setContentView(R.layout.inner_layout);
    }

    //Criando o método limpar janela
    public void limparJanela() {
        edtSenha.setText("");
        edtUsuario.setText("");
        edtUsuario.requestFocus();
    }

    //vai sair do sistema
    public void sairSistema(View view) {
        finish();
    }


}
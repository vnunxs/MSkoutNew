package br.com.myskout.myskout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ParceirosActivity extends AppCompatActivity {
    //Criando a varialvel para o botão FAB parceiros
    FloatingActionButton fabParcCadastrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parceiros_layout);

        //Apresentar o xml ao Java
        fabParcCadastrar = findViewById(R.id.fabParcCadastrar);

        //Criando o click no botão FAB
        fabParcCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Click no botão cadastrar", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //Criando e adicionando o menu activity

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Isntanciando o menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_parceiras, menu);

        return super.onCreateOptionsMenu(menu);
    }
    //Criando os click`s de menu


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mParcAlterar:
                Toast.makeText(getApplicationContext(), "Clique em Alterar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mParcExcluir:
                Toast.makeText(getApplicationContext(), "Clique em Excluir", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mParcPesquisar:
                Toast.makeText(getApplicationContext(), "Clique em Pesquisar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mParcSair:
                Toast.makeText(getApplicationContext(), "Clique em Sair", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

public class CandidatosActivity extends AppCompatActivity {
    BottomAppBar bottomAppBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.candidatos_layout);

        bottomAppBar = findViewById(R.id.bottomBarCandidatos);

        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mBottomAlterar:
                        Toast.makeText(getApplicationContext(), "Click no botão alterar", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mBottomExcluir:
                        Toast.makeText(getApplicationContext(), "Click no botão excluir", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mBottomPesquisar:
                        Toast.makeText(getApplicationContext(), "Click no botão pesquisar", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });

        //Clicando no ícone de navegção do bottomBar
        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei no ícone bottomBat", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuPrincipalActivity extends AppCompatActivity implements View.OnClickListener {
    //Declarando variaveis globais dos componentes
    CardView cardPerfil, cardVagas, cardCandidatos, cardRecrutamento, cardTalento, cardParceiros;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);

        //Aprensentando as variaveis xml para o java
        cardPerfil = findViewById(R.id.cardPerfil);
        cardVagas = findViewById(R.id.cardVagas);
        cardCandidatos = findViewById(R.id.cardCandidatos);
        cardRecrutamento = findViewById(R.id.cardRecrutamento);
        cardTalento = findViewById(R.id.cardTalento);
        cardParceiros = findViewById(R.id.cardParceiros);

        //OS componentes recebendo o evento de click
        cardPerfil.setOnClickListener(this);
        cardVagas.setOnClickListener(this);
        cardCandidatos.setOnClickListener(this);
        cardRecrutamento.setOnClickListener(this);
        cardTalento.setOnClickListener(this);
        cardParceiros.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cardPerfil:
                startActivity(new Intent(
                        getApplicationContext(),
                        PerfilActivity.class
                ));
                finish();
                break;
            case R.id.cardVagas:
                startActivity(new Intent(
                        getApplicationContext(),
                        VagasActivity.class
                ));
                finish();
                break;
            case R.id.cardCandidatos:
                startActivity(new Intent(
                        getApplicationContext(),
                        CandidatosActivity.class
                ));
                finish();
                break;
            case R.id.cardRecrutamento:
                startActivity(new Intent(
                        getApplicationContext(),
                        RecrutadoresActivity.class
                ));
                finish();
                break;
            case R.id.cardTalento:
                startActivity(new Intent(
                        getApplicationContext(),
                        TalentosActivity.class
                ));
                finish();
                break;
            case R.id.cardParceiros:
                startActivity(new Intent(
                        getApplicationContext(),
                        ParceirosActivity.class
                ));
                finish();
                break;
        }
    }
}
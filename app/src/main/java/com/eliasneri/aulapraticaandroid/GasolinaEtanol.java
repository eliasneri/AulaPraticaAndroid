package com.eliasneri.aulapraticaandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class GasolinaEtanol extends AppCompatActivity {

    // Atributos para dados persistente do aplicativo
    private static String GASOLINA = "GASOLINA";
    private static String ETANOL = "ETANOL";
    private double gasolina;
    private double etanol;

    // Atributos com referências as vies da activity
    private EditText txgasolina;
    private EditText txetanol;
    private Button calculaButton;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_gasolina_etanol);

    txgasolina = (EditText) findViewById(R.id.txgasolina);
    txetanol = (EditText)findViewById(R.id.txetanol);
    calculaButton = (Button)  findViewById(R.id.calculaButton);
    resultado = (TextView) findViewById(R.id.resultado);
    calculaButton.setOnClickListener(ouvinteCalculaButton);

    if (savedInstanceState != null){
        gasolina = savedInstanceState.getDouble(GASOLINA);
        etanol = savedInstanceState.getDouble(ETANOL);
        txgasolina.setText(String.format("% .f1", gasolina);
        txetanol.setText(String.format("% .f1", gasolina);
        calcula();
    }

    private void calcula() {
        gasolina = Double.parseDouble(txgasolina.getText().toString());
        etanol = Double.parseDouble(txetanol.getText().toString());
        resultado.setText(Calculadora.calcula(gasolina, etanol));
     }

    private View.OnClickListener ouvinteCalculaButton = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            calcula();
        }
    };

    @Override
    protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putDouble(GASOLINA, gasolina);
    outState.putDouble(ETANOL, etanol);
        }



    }




}
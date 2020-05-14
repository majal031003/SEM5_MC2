package com.example.sem2mcalderon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
EditText et1,et2,et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.etValor1);
        et2 = findViewById(R.id.etValor2);
        et3 = findViewById(R.id.etResultado2);
    }
    public void Sumar (View v){
        int Valor1, Valor2, Resultado;
        Valor1 = Integer.parseInt(et1.getText().toString());
        Valor2 = Integer.parseInt(et2.getText().toString());
        Resultado = Valor1 + Valor2;
        et3.setText(Integer.toString(Resultado));
    }
}


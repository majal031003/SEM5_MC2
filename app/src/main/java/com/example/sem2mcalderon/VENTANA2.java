package com.example.sem2mcalderon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class VENTANA2 extends AppCompatActivity {
EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_e_n_t_a_n_a2);
        et1 = findViewById(R.id.etResultado2);
    }
    public void Sumar (View v){
        int  Resultado = 10+10;
        et1.setText(Integer.toString(Resultado));
    }
}

package com.example.sem2mcalderon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class RELATIVELAYOUT extends AppCompatActivity {
    EditText et1,et2,et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_e_l_a_t_i_v_e_l_a_y_o_u_t);
        et1 = findViewById(R.id.etValor);
        et2 = findViewById(R.id.etValor2);
        et3 = findViewById(R.id.etResultado);
    }
    public void Sumar (View v){
        int Valor1, Valor2, Resultado;
        Valor1 = Integer.parseInt(et1.getText().toString());
        Valor2 = Integer.parseInt(et2.getText().toString());
        Resultado = Valor1 + Valor2;
        et3.setText(Integer.toString(Resultado));
    }
}

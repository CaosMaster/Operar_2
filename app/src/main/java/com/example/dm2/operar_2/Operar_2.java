package com.example.dm2.operar_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Operar_2 extends AppCompatActivity {

    private EditText txtPimer;
    private EditText txtSegundo;
    private TextView lblResultado;
    //private Button btnSumar;
    //private Button btnRestar;
    //private Button btnDividir;
    //private Button btnMultiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operar_2);

        txtPimer = (EditText) findViewById(R.id.txtPrimer);
        txtSegundo = (EditText) findViewById(R.id.txtSegundo);
        lblResultado = (TextView) findViewById(R.id.lblResultado);
        //btnSumar =(Button) findViewById(R.id.btnSumar);
        //btnRestar =(Button) findViewById(R.id.btnRestar);
        //btnMultiplicar =(Button) findViewById(R.id.btnMultiplicar);
        //btnDividir =(Button) findViewById(R.id.btnDividir);
    }

    public void operar(View v){
        int num1, num2, resultado;
        Button b = (Button) v; //convertimos la view a button
        String operacion = b.getText().toString(); //guardamos el texto que contiene cada boton
       //if (btnSumar.getId()==v.getId()){
        if (operacion.equals("+")){
           num1=Integer.parseInt(txtPimer.getText().toString());
           num2=Integer.parseInt(txtSegundo.getText().toString());
           resultado=num1+num2;

           lblResultado.setText(lblResultado.getText()+" "+resultado);
       }

       //if (btnRestar.getId()==v.getId()){
        if (operacion.equals("-")){

           num1=Integer.parseInt(txtPimer.getText().toString());
           num2=Integer.parseInt(txtSegundo.getText().toString());
           resultado=num1-num2;

           lblResultado.setText(lblResultado.getText()+" "+resultado);
       }

       //if (btnMultiplicar.getId()==v.getId()){
        if (operacion.equals("x")){

           num1=Integer.parseInt(txtPimer.getText().toString());
           num2=Integer.parseInt(txtSegundo.getText().toString());
            resultado=num1*num2;

           lblResultado.setText(lblResultado.getText()+" "+resultado);
       }

       //if (btnDividir.getId()==v.getId()){
        if (operacion.equals("/")){
            num1=Integer.parseInt(txtPimer.getText().toString());
            num2=Integer.parseInt(txtSegundo.getText().toString());
            resultado=num1/num2;

           lblResultado.setText(lblResultado.getText()+" "+resultado);
       }

    }
}

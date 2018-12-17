package com.example.invitado1.calculadoraordinaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;


    //inicializo las variables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        tv1 = (TextView) findViewById(R.id.resultado);
        }

     //este metodo realiza la suma
     public void sumar(View view){
        cuentas("suma");
     }


    //este metodo realiza la resta
    public void restar(View view){
        cuentas("resta");
    }

    public void multiplicar(View view){
        cuentas("multiplicar");
    }

    public void division(View view){
        cuentas("dividir");
    }


    public void cuentas(String tipoDeCuenta){

        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        double num1 = Integer.parseInt(valor1);
        double num2 = Integer.parseInt(valor2);


        double cuenta = 0;
        switch (tipoDeCuenta) {
            case "suma":
                cuenta = num1 + num2;
            break;
            case "resta":
                cuenta = num1 - num2;
                break;
            case "dividir":
                    cuenta = num1 / num2;
            break;
            case "multiplicar" :
                cuenta = num1 * num2;
        }
        String result = String.valueOf(cuenta);
        tv1.setText(result);

    }


       //este metodo resta






}

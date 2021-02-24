package com.example.sumarrestar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int valor1=0;
    int valor2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public int suma(){
        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);
        valor1 = Integer.parseInt(num1.getText().toString());
        valor2 = Integer.parseInt(num2.getText().toString());
        int resul = valor1+valor2;
        return resul;
    }
    public int resta(){
        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);
        valor1 = Integer.parseInt(num1.getText().toString());
        valor2 = Integer.parseInt(num2.getText().toString());
        int resul = valor1-valor2;
        return resul;
    }
    public void operar(View vista){
        CheckBox checkSuma = (CheckBox)findViewById(R.id.checkSuma);
        CheckBox checkResta = (CheckBox)findViewById(R.id.checkResta);
        TextView solucion = (TextView) findViewById(R.id.solucion);
        if(checkSuma.isChecked() && checkResta.isChecked()){
                solucion.setText("la suma es: "+suma()+" y la resta: "+resta());
        }else if(checkSuma.isChecked() && !checkResta.isChecked()){
            solucion.setText("la suma es: "+suma());
        }else if(!checkSuma.isChecked() && checkResta.isChecked()){
            solucion.setText("la resta es: "+resta());
        }

    }
}
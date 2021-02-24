package com.example.contador2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int cont =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void incrementar(View vista){
        cont++;
        mostrarResultado();
    }
    public void decrementar(View vista){
        CheckBox negativ = (CheckBox)findViewById(R.id.contNegativo);
        if(cont<=0 && negativ.isChecked()){
            cont--;
            mostrarResultado();
        }else if(cont>0){
            cont--;
            mostrarResultado();
        }
    }
    public void reset(View vista){
        EditText resetNum = (EditText) findViewById(R.id.resetCont);
        int numReset = Integer.parseInt(resetNum.getText().toString());
        cont = numReset;
        mostrarResultado();
    }
    public void mostrarResultado(){
        EditText cuenta = (EditText) findViewById(R.id.numCont);
        cuenta.setText(""+cont);
    }
}
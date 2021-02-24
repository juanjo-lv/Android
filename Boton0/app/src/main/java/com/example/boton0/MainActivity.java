package com.example.boton0;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button boton;
    private int numVeces = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boton = new Button(this);
        boton.setText(R.string.pulsameAdmiracion);
        boton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                botonPulsado();
            }
        });
        setContentView(boton);
    }
    public void botonPulsado(){
        String numPulsados;
        ++numVeces;
       // boton.setText(getResources().getString(R.string.pulsado)+" "+numVeces+" "+getResources().getString(R.string.veces));
        android.content.res.Resources res = getResources();
        numPulsados = res.getQuantityString(R.plurals.numPulsaciones, numVeces, numVeces);
        boton.setText((numPulsados));

        String[] planetas = res.getStringArray(R.array.array_planetas);
        String misPlanetas ="";
        for(String st:planetas){
            misPlanetas+=st +"\n";
        }
        Toast notification = Toast.makeText(this,misPlanetas, Toast.LENGTH_LONG);
        notification.show();
    }


}
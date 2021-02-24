package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int cont = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reiniciar(View vista){
            cont = 0;
            mostrarResultado();
    }
    public void incrementar(View vista){
            cont++;
            mostrarResultado();
    }
    public void decrementar(View vista){
            cont--;
            mostrarResultado();
    }
    public void mostrarResultado(){
        TextView texto = (TextView)findViewById(R.id.contadorPulsaciones);
        texto.setText("contador: "+cont);
    }

}
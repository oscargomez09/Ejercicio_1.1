package com.example.ejercicio_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_sumar, btn_restar, btn_multi, btn_divi;
    TextView text_respuesta;
    EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sumar = findViewById(R.id.btnsumar);
        btn_restar = findViewById(R.id.btnrestar);
        btn_multi = findViewById(R.id.btnmultiplicar);
        btn_divi = findViewById(R.id.btndividir);
        num1 = findViewById(R.id.numero1);
        num2 = findViewById(R.id.numero2);
        text_respuesta = findViewById(R.id.respuesta);

        btn_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText(suma(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()))+"");
            }
        });

        btn_restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText(resta(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()))+"");
            }
        });

        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText(multiplicacion(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()))+"");
            }
        });

        btn_divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText(division(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()))+"");
            }
        });

    }

    public double suma (int a, int b){
        return a+b;
    }

    public double resta (int a, int b){
        return a-b;
    }

    public double multiplicacion (int a, int b){
        return a*b;
    }

    public double division (int a, int b){
        int resp = 0;
        if(b!=0){
            resp=a/b;
        }
        return resp;
    }

}
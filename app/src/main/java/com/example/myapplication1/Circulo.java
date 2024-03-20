package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Circulo extends AppCompatActivity {

    Button salir, regresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        EditText radio = (EditText)findViewById(R.id.Radio);
        Button calc = (Button)findViewById(R.id.CalcCir);
        TextView res = (TextView)findViewById(R.id.ResCir);

        salir = (Button)findViewById(R.id.SalirCir);
        regresar =(Button)findViewById(R.id.MenuCir);


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double rad = Double.parseDouble(radio.getText().toString());
                double area = Math.pow(rad,2)*3.1416;
                res.setText("Área: "+area);
            }
        });

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Menu.class);
                startActivity(intent);
            }
        });
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AreaVolumen.class);
                startActivity(intent);
            }
        });
    }
}
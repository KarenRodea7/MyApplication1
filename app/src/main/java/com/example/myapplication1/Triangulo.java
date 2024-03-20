package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Triangulo extends AppCompatActivity {

    Button salir, regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        EditText altura = (EditText)findViewById(R.id.AltT);
        EditText base = (EditText)findViewById(R.id.BaseT);
        Button calc = (Button)findViewById(R.id.CalcT);
        TextView res = (TextView)findViewById(R.id.ResT);

        salir = (Button)findViewById(R.id.SalirTri);
        regresar =(Button)findViewById(R.id.MenuTri);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double alt = Double.parseDouble(altura.getText().toString());
                Double bas = Double.parseDouble(base.getText().toString());
                double area = (bas*alt)/2;
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
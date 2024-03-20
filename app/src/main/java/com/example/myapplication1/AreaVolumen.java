package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AreaVolumen extends AppCompatActivity {
    Button Circ, Trian, PRec, Cubo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_volumen);

        Circ = (Button)findViewById(R.id.Circulo);
        Trian = (Button)findViewById(R.id.Triangulo);
        PRec = (Button)findViewById(R.id.PrismaR);
        Cubo = (Button)findViewById(R.id.Cubo);

        Circ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Circulo.class);
                startActivity(i);
            }
        });

        Trian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Triangulo.class);
                startActivity(i);
            }
        });

        PRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PrisRectang.class);
                startActivity(i);
            }
        });

        Cubo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), com.example.myapplication1.Cubo.class);
                startActivity(i);
            }
        });


    }
}
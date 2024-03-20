package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cubo extends AppCompatActivity {

    Button salir, regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);

        salir = (Button)findViewById(R.id.SalirCubo);
        regresar =(Button)findViewById(R.id.MenuCubo);

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
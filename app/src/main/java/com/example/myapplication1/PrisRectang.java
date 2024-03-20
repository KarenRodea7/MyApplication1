package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrisRectang extends AppCompatActivity {

    Button salir, regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pris_rectang);

        EditText lado = (EditText)findViewById(R.id.LadoPR);
        EditText base = (EditText)findViewById(R.id.BasePR);
        EditText altura = (EditText)findViewById(R.id.AltPR);
        Button calc = (Button)findViewById(R.id.CalcPR);
        TextView res = (TextView)findViewById(R.id.ResPR);

        salir = (Button)findViewById(R.id.SalirPRec);
        regresar =(Button)findViewById(R.id.MenuPRec);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double lad = Double.parseDouble(lado.getText().toString());
                Double bas = Double.parseDouble(base.getText().toString());
                Double alt = Double.parseDouble(altura.getText().toString());
                double area = (bas*lad)*alt;
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
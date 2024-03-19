package com.example.myapplication1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Juego extends AppCompatActivity implements View.OnClickListener {

    TextView Total, Pregunta;
    Button R1, R2, R3, R4, Cont, SalirJuego, MenuJuego;
    Button menu, salir;

    int puntaje = 0;
    int total = PregResp.preguntas.length;
    int indice = 0;
    String seleccionado = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        menu = findViewById(R.id.MenuJuego);
        salir = findViewById(R.id.SalirJuego);

        Total = findViewById(R.id.total);
        Pregunta = findViewById(R.id.Preg);
        R1 = findViewById(R.id.R1);
        R2 = findViewById(R.id.R2);
        R3 = findViewById(R.id.R3);
        R4 = findViewById(R.id.R4);
        Cont = findViewById(R.id.Cont);


        /*MenuJuego.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(getApplicationContext(), Menu.class);
                startActivity(intent);
            }
        });
        SalirJuego.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });*/

        R1.setOnClickListener(this);
        R2.setOnClickListener(this);
        R3.setOnClickListener(this);
        R4.setOnClickListener(this);
        Cont.setOnClickListener(this);

        Total.setText("Total de preguntas: " + total);

        siguiente();

    }

    @Override
    public void onClick(View v) {
        R1.setBackgroundColor(Color.WHITE);
        R2.setBackgroundColor(Color.WHITE);
        R3.setBackgroundColor(Color.WHITE);
        R4.setBackgroundColor(Color.WHITE);

        Button click = (Button) v;
        if (click.getId() == R.id.Cont) {
            if (seleccionado.equals(PregResp.respuesta[indice])) {
                puntaje++;
            }
            indice++;
            siguiente();


        } else {
            //choices button clicked
            seleccionado = click.getText().toString();
            click.setBackgroundColor(Color.MAGENTA);
        }

    }

    void siguiente() {
        if (indice == total) {
            terminarQuiz();
            return;
        }

        Pregunta.setText(PregResp.preguntas[indice]);
        R1.setText(PregResp.opciones[indice][0]);
        R2.setText(PregResp.opciones[indice][1]);
        R3.setText(PregResp.opciones[indice][2]);
        R4.setText(PregResp.opciones[indice][3]);
    }

    void terminarQuiz() {
        String passStatus = "";
        if (puntaje > total * 0.6 && puntaje < total * 0.8) {
            passStatus = "De panzaso";
        } else if (puntaje >= total * 0.8 && puntaje < total * 0.9) {
            passStatus = "Bien hecho";
        } else if (puntaje > total * 0.0 && puntaje == total) {
            passStatus = "Excelente";
        } else {
            passStatus = "Fallaste";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Tu puntaje fue " + puntaje + " de " + total)
                .setPositiveButton("Reiniciar", (dialogInterface, i) -> reiniciarQuiz())
                .setCancelable(false)
                .show();
    }

    void reiniciarQuiz() {
        puntaje = 0;
        indice = 0;
        siguiente();
    }



}
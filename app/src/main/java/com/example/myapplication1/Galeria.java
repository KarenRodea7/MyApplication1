package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

public class Galeria extends AppCompatActivity {

    List<CarouselItem> list = new ArrayList<>();

    Button salirgal, regresargal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        salirgal = (Button)findViewById(R.id.SalirGal);
        regresargal = (Button)findViewById(R.id.MenuGal);

        ImageCarousel carousel = findViewById(R.id.carousel);
        carousel.registerLifecycle(getLifecycle());

        list.add(new CarouselItem(R.drawable.canis_major, "Constelación Canis Maior (Fuente: Stellarium, Free Art License)"));
        list.add(new CarouselItem(R.drawable.corvus,"Constelación Corvus (Fuente: Stellarium, Free Art License)"));
        list.add(new CarouselItem(R.drawable.draco,"Constelación Draco (Fuente: Stellarium, Free Art License)"));
        list.add(new CarouselItem(R.drawable.leo,"Constelación Leo (Fuente: Stellarium, Free Art License)"));
        list.add(new CarouselItem(R.drawable.lyra,"Constelación Lyra (Fuente: Stellarium, Free Art License)"));
        list.add(new CarouselItem(R.drawable.orion,"Constelación Orion (Fuente: Stellarium, Free Art License)"));
        list.add(new CarouselItem(R.drawable.pegasus,"Constelación Pegasus (Fuente: Stellarium, Free Art License)"));
        list.add(new CarouselItem(R.drawable.scorpius,"Constelación Scorpius (Fuente: Stellarium, Free Art License)"));
        list.add(new CarouselItem(R.drawable.ursa_major,"Constelación Ursa major (Fuente: Stellarium, Free Art License)"));
        list.add(new CarouselItem(R.drawable.ursa_minor,"Constelación Ursa minor (Fuente: Stellarium, Free Art License)"));

        carousel.setData(list);

        regresargal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Menu.class);
                startActivity(intent);
            }
        });
        salirgal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        }

}
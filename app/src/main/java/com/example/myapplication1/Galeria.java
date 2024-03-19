package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

public class Galeria extends AppCompatActivity {

    List<CarouselItem> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        ImageCarousel carousel = findViewById(R.id.carousel);
        carousel.registerLifecycle(getLifecycle());

        list.add(new CarouselItem(R.drawable.canis_major, "Constelación Canis Maior (Fuente: Stellarium, Free Art License)"));
        list.add(new CarouselItem(R.drawable.corvus,"Constelación Corvus (Fuente: Stellarium, Free Art License)"));


        carousel.setData(list);
        }
}
package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class Galeria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        ImageSlider imageSlider = findViewById(R.id.Images);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.images__63_, "Cielo" ,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.images__61_, "Figuras" ,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.images__62_, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.wp8968806, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);


        }
}
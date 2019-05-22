package com.example.rogerio_3;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HotelPetrolinaFotos extends AppCompatActivity {

    private int[] fotos = {
            R.drawable.hotel01,
            R.drawable.hotel02,
            R.drawable.hotel03,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_petrolina_fotos);

        ViewPager vp = (ViewPager) findViewById(R.id.viewpager);
        vp.setAdapter(new AdapterImgBar(this,fotos));

    }
}

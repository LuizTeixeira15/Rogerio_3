package com.example.rogerio_3;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ResFotosMonjopina extends AppCompatActivity {

    private int[] fotos = {
            R.drawable.restau1,
            R.drawable.restau2,
            R.drawable.restau3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_fotos_monjopina);

        ViewPager vp = (ViewPager) findViewById(R.id.viewpager);
        vp.setAdapter(new AdapterImgBar(this,fotos));
    }
}

package com.example.rogerio_3;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class BarFotosQuiosque extends Activity {


    private int[] fotos = {
            R.drawable.bar01,
            R.drawable.bar02,
            R.drawable.bar03,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_fotos_quiosque);

        ViewPager vp = (ViewPager) findViewById(R.id.viewpager);
        vp.setAdapter(new AdapterImgBar(this,fotos));


    }

}

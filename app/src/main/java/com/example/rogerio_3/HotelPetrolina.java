package com.example.rogerio_3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HotelPetrolina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_petrolina);

        ImageView gps = findViewById(R.id.gps);
        gps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Uri quisoque = Uri.parse("geo:0,0?q=Quiosque+Chopp+Brahma+nova+york+Petrolina");
                Uri quisoque = Uri.parse("geo:0,0?q=kris+hotel+Petrolina");
                Intent it = new Intent(Intent.ACTION_VIEW, quisoque);
                startActivity(it);
            }
        });

        ImageView foto = (ImageView) findViewById(R.id.foto);
        foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(HotelPetrolina.this,HotelPetrolinaFotos.class);
                startActivity(it);
            }
        });

        final ImageView agenda = (ImageView)findViewById(R.id.agenda);
        agenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(HotelPetrolina.this,reserva.class);
                startActivity(it);
            }
        });
    }
}

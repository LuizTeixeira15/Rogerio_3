package com.example.rogerio_3;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ResMonjopina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_monjopina);

        ImageView foto = (ImageView)findViewById(R.id.foto);
        foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =  new Intent(ResMonjopina.this,ResFotosMonjopina.class);
                startActivity(it);
            }
        });

        ImageView gps = findViewById(R.id.gps);
        gps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Uri quisoque = Uri.parse("geo:0,0?q=Quiosque+Chopp+Brahma+nova+york+Petrolina");
                Uri quisoque = Uri.parse("geo:0,0?q=monjopina+Petrolina");
                Intent it = new Intent(Intent.ACTION_VIEW, quisoque);
                startActivity(it);
            }
        });

        final ImageView card = (ImageView)findViewById(R.id.card);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ResMonjopina.this,RestCardapio.class);
                startActivity(it);
            }
        });
        ImageView agenda = (ImageView)findViewById(R.id.agenda);
        agenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Sem Agenda", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

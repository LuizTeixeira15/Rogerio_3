package com.example.rogerio_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt_bares = (Button) findViewById(R.id.bt_bares);
        bt_bares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Bares.class);
                startActivity(intent);
            }
        });

        Button bt_restaurente = (Button) findViewById(R.id.bt_restaurante);
        bt_restaurente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,restaurante.class);
                startActivity(intent);
            }
        });

        Button bt_turismo = (Button) findViewById(R.id.bt_turismo);
        bt_turismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,turismo.class);
                startActivity(intent);
            }
        });

        Button bt_hotel = (Button) findViewById(R.id.bt_hotel);
        bt_hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,hotel.class);
                startActivity(intent);
            }
        });

    }


}

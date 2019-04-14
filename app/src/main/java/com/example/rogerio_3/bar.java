package com.example.rogerio_3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class bar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);

        Button img_1 = findViewById(R.id.img_1);
        img_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Uri quisoque = Uri.parse("geo:0,0?q=Quiosque+Chopp+Brahma+nova+york+Petrolina");
                Uri quisoque = Uri.parse("geo:0,0?q=quiosque+brahma+av+monsehor+angelo+sampaio+950+Petrolina");
                Intent it = new Intent(Intent.ACTION_VIEW,quisoque);
                startActivity(it);
            }
        });


    }
}

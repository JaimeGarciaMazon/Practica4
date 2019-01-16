package com.example.jaime.pratica4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView idImagen;
    Button idbtn1;
    Button idbtn2;
    Button idbtn3;
    Button idbtn4;
    AppCompatActivity  nuevo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nuevo = this;
        idImagen = findViewById(R.id.idImagen);
        idbtn1 = findViewById(R.id.idbtn1);
        idbtn2 = findViewById(R.id.idbtn2);
        idbtn3 = findViewById(R.id.idbtn3);
        idbtn4 = findViewById(R.id.idbtn4);


    idbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nuevo,NumerosPrimos.class);
                startActivity(intent);
            }
        });
    idbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nuevo,JuegoAciertos.class);
                startActivity(intent);
            }
        });

        idbtn3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(nuevo,DesplazandoImagen.class);
            startActivity(intent);
        }
    });    }
}

package com.example.jaime.pratica4;


import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SeleccionandoImagenes extends Activity {

    Button botonPrimeraImagen, botonSegundaImagen, botonTerceraImagen, botonCuartaImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionando_imagenes);

        botonPrimeraImagen = findViewById(R.id.botonPrimeraImagen);
        botonSegundaImagen = findViewById(R.id.botonSegundaImagen);
        botonTerceraImagen = findViewById(R.id.botonTerceraImagen);
        botonCuartaImagen = findViewById(R.id.botonCuartaImagen);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.foto1, new FragmentPrimeraFoto());
        ft.commit();

        botonPrimeraImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.foto1, new FragmentPrimeraFoto());
                ft.commit();
            }
        });

        botonSegundaImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.foto1, new FragmentSegundaFoto());
                ft.commit();
            }
        });

        botonTerceraImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.foto1, new FragmentTerceraFoto());
                ft.commit();
            }
        });

        botonCuartaImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.foto1, new FragmentCuartaFoto());
                ft.commit();
            }
        });
    }
}

package com.example.jaime.pratica4;


import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class DesplazandoImagen extends AppCompatActivity  implements FragmentImagen1.OnFragmentInteractionListener,FragmentImagen2.OnFragmentInteractionListener {

    Fragment FragmentImagen1;
    Fragment FragmentImagen2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desplazando_imagen);
    }


}
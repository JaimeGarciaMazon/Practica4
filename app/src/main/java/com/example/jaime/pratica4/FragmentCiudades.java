package com.example.jaime.pratica4;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class FragmentCiudades extends Fragment {

    private String[] ciudades;
    ArrayAdapter<String> adaptadorCiudades;
    public ListView listaViewCiudades;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragment_ciudades, container, false);
        ciudades = new String[] {getResources().getString(R.string.Lisboa),
                getResources().getString(R.string.Paris), getResources().getString(R.string.Madrid),
                getResources().getString(R.string.Berlin), getResources().getString(R.string.Roma),
                getResources().getString(R.string.Kiev), getResources().getString(R.string.Londres),
                getResources().getString(R.string.Ciudaddemexico), getResources().getString(R.string.BuenosAires),
                getResources().getString(R.string.Moscu)};
        List<String> listaCiudades =  Arrays.asList(ciudades);
        Collections.shuffle(listaCiudades);
        adaptadorCiudades = new ArrayAdapter<String>(this.getActivity() , android.R.layout.simple_list_item_1 , listaCiudades);
        listaViewCiudades = view.findViewById(R.id.listaCiudades);
        listaViewCiudades.setAdapter(adaptadorCiudades);
        return view;
    }

}

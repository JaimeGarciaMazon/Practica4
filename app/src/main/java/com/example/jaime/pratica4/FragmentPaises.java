package com.example.jaime.pratica4;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FragmentPaises extends Fragment {


    private String[] paises;
    ArrayAdapter<String> adaptadorPaises;
    public ListView listViewPaises;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_paises, container, false);

        paises = new String[] {getResources().getString(R.string.España),
                getResources().getString(R.string.Portugal), getResources().getString(R.string.Francia), getResources().getString(R.string.Italia),
                getResources().getString(R.string.Alemania),getResources().getString(R.string.Rusia), getResources().getString(R.string.Ucrania),
                getResources().getString(R.string.Inglaterra), getResources().getString(R.string.Mexico), getResources().getString(R.string.Argentina)};
        List<String> listaPaises = Arrays.asList(paises);
        Collections.shuffle(listaPaises);
        adaptadorPaises = new ArrayAdapter<String>(this.getActivity() , android.R.layout.simple_list_item_1 , listaPaises);
        listViewPaises = view.findViewById(R.id.listaPaises);
        listViewPaises.setAdapter(adaptadorPaises);
        return view;
    }


}

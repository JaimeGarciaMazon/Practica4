package com.example.jaime.pratica4;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class JuegoAciertos extends Activity {

    Map<String, String> Resultado = new HashMap<>();


    FragmentPaises fragmentoPaises;
    FragmentCiudades fragmentoCiudades;

    TextView textViewPaises, textViewCiudades;

    Button buttonVerificar;
    ImageView imageViewResultado;

    public boolean ciudadClicked, paisClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_aciertos);

        setTitle("Juego de aciertos");

        Resultado.put(getString(R.string.España), getString(R.string.Madrid));
        Resultado.put(getString(R.string.Portugal), getString(R.string.Lisboa));
        Resultado.put(getString(R.string.Francia), getString(R.string.Paris));
        Resultado.put(getString(R.string.Italia), getString(R.string.Roma));
        Resultado.put(getString(R.string.Alemania), getString(R.string.Berlin));
        Resultado.put(getString(R.string.Rusia), getString(R.string.Moscu));
        Resultado.put(getString(R.string.Ucrania), getString(R.string.Kiev));
        Resultado.put(getString(R.string.Inglaterra), getString(R.string.Londres));
        Resultado.put(getString(R.string.Mexico), getString(R.string.Ciudaddemexico));
        Resultado.put(getString(R.string.Argentina), getString(R.string.BuenosAires));

        textViewPaises = findViewById(R.id.textViewPais);
        textViewCiudades = findViewById(R.id.textViewCiudad);

        buttonVerificar = findViewById(R.id.buttonVerificar);
        imageViewResultado = findViewById(R.id.imageViewResultado);
        imageViewResultado.setVisibility(View.INVISIBLE); // que no se muestre

        fragmentoPaises = (FragmentPaises) getFragmentManager().findFragmentById(R.id.fragmentPaises);
        fragmentoCiudades = (FragmentCiudades) getFragmentManager().findFragmentById(R.id.fragmentCiudades);

        ciudadClicked = false;
        fragmentoCiudades.listaViewCiudades.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                textViewCiudades.setText(fragmentoCiudades.adaptadorCiudades.getItem(position));
                ciudadClicked = true;
            }
        });

        paisClicked = false;
        fragmentoPaises.listViewPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                textViewPaises.setText(fragmentoPaises.adaptadorPaises.getItem(position));
                paisClicked = true;
            }
        });

        buttonVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ciudadClicked && paisClicked) {
                    imageViewResultado.setVisibility(View.VISIBLE);
                    if (verificarPaisCiudad(textViewPaises.getText().toString(),
                            textViewCiudades.getText().toString())) {
                        imageViewResultado.setImageDrawable(getDrawable(R.drawable.bien));
                    } else {
                        imageViewResultado.setImageDrawable(getDrawable(R.drawable.mal));
                    }
                }
            }
        });
    }

    private boolean verificarPaisCiudad(String Paises, String Ciudades) {
        return this.Resultado.get(Paises).equals(Ciudades);
    }

}

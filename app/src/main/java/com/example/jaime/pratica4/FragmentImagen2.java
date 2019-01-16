package com.example.jaime.pratica4;

import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentImagen2 extends Fragment {

    View v;
    private FragmentImagen1.OnFragmentInteractionListener mListener;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_fragment_imagen2, container, false);
        return v;
    }

    public interface OnFragmentInteractionListener {
    }
}

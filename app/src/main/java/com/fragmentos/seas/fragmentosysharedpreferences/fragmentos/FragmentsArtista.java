package com.fragmentos.seas.fragmentosysharedpreferences.fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fragmentos.seas.fragmentosysharedpreferences.R;

public class FragmentsArtista extends Fragment {


    public FragmentsArtista() {
        // Required empty public constructor
    }


    /*Bloque de instancia*/
    //Cualquier que requiera de un fragmento en vez de hacer un new llamará a este método estático que devolverá un fragmento
    public static FragmentsArtista newInstance(Bundle datos){//Bundle para poder transferir datos entre diferentes activities, parecido a HashMaps
        FragmentsArtista fragmentsArtista = new FragmentsArtista();

        if(datos!=null){
            fragmentsArtista.setArguments(datos);
        }
        return fragmentsArtista;

    }
    /**/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista =  inflater.inflate(R.layout.fragments_artista, container, false);
        if(vista!=null){

        }
    }

}

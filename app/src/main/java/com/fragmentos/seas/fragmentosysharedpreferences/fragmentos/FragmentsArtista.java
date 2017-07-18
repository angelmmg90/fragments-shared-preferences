package com.fragmentos.seas.fragmentosysharedpreferences.fragmentos;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.fragmentos.seas.fragmentosysharedpreferences.R;
import com.fragmentos.seas.fragmentosysharedpreferences.beans.Artista;

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

    private ImageView imagen;
    private TextView nombreArtista;
    private TextView descArtista;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista =  inflater.inflate(R.layout.fragments_artista, container, false);
        if(vista!=null){
            imagen = (ImageView) vista.findViewById(R.id.imgArtista);
            nombreArtista = (TextView) vista.findViewById(R.id.txtNombreArtista);
            descArtista = (TextView) vista.findViewById(R.id.txtDescripcionArtista);

        }
        return vista;
    }

    public void modificarDatosArtista(Artista artista){
        nombreArtista.setText(artista.getNombre());
        descArtista.setText(artista.getDescripcion());

    }

    private Drawable seleccionarFotoArtista(Artista artista){
        if(artista.getNombre().equals("Adele")){

        }
        return null;
    }


}

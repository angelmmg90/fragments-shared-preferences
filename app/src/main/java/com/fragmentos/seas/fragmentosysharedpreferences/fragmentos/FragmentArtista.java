package com.fragmentos.seas.fragmentosysharedpreferences.fragmentos;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fragmentos.seas.fragmentosysharedpreferences.R;
import com.fragmentos.seas.fragmentosysharedpreferences.beans.Artista;

public class FragmentArtista extends Fragment {


    public FragmentArtista() {
        // Required empty public constructor
    }


    /*Bloque de instancia*/
    //Cualquier que requiera de un fragmento en vez de hacer un new llamará a este método estático que devolverá un fragmento
    public static FragmentArtista newInstance(Bundle datos){//Bundle para poder transferir datos entre diferentes activities, parecido a HashMaps
        FragmentArtista fragmentArtista = new FragmentArtista();

        if(datos!=null){
            fragmentArtista.setArguments(datos);
        }
        return fragmentArtista;

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
        imagen.setImageDrawable(seleccionarFotoArtista(artista));

    }

    private Drawable seleccionarFotoArtista(Artista artista){
        Drawable foto = null;
        if(artista.getNombre().equals("Abstract1")){
            //Actualización de la SDK por eso se pone la segunda linea
            //foto = getResources().getDrawable(R.drawable.abstract_1);
            foto = ResourcesCompat.getDrawable(getResources(), R.drawable.abstract_1, null);
        }else if (artista.getNombre().equals("Abstract2")){
            foto = ResourcesCompat.getDrawable(getResources(), R.drawable.abstract_3, null);
        }else if (artista.getNombre().equals("Abstract3")){
            foto = ResourcesCompat.getDrawable(getResources(), R.drawable.abstract_3, null);
        }else{
            foto = ResourcesCompat.getDrawable(getResources(), R.drawable.abstract_4, null);
        }
        return foto;
    }


}

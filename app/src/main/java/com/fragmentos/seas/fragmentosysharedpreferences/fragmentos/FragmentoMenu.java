package com.fragmentos.seas.fragmentosysharedpreferences.fragmentos;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.fragmentos.seas.fragmentosysharedpreferences.R;
import com.fragmentos.seas.fragmentosysharedpreferences.beans.Artista;
import com.fragmentos.seas.fragmentosysharedpreferences.interfaces.ArtistaListener;

import java.util.ArrayList;


public class FragmentoMenu extends Fragment {
    private ArrayList<Artista> listaMusic = new ArrayList<Artista>();
    private ArtistaListener listener;

    public FragmentoMenu() {
        // Required empty public constructor
    }
    /*Bloque de instancia*/
    //Cualquier que requiera de un fragmento en vez de hacer un new llamará a este método estático que devolverá un fragmento
    public static FragmentoMenu newInstance(Bundle datos){//Bundle para poder transferir datos entre diferentes activities, parecido a HashMaps
        FragmentoMenu fragmentoMenu = new FragmentoMenu();

        if(datos!=null){
            fragmentoMenu.setArguments(datos);
        }
        return fragmentoMenu;

    }
    /**/

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        /*Vincular una interfaces que me notifique acciones desde el Activity y el Fragmento*/
        listener = (ArtistaListener) context;

    }

    @Override
    public void onCreate(Bundle datos){
        super.onCreate(datos);
        if(getArguments()!=null){
            // Recuperamos los datos de la clase Bundle ("CLAVE","VALOR"), la cual setteamos en newInstance
        }
    }



    private ImageView imgAbstract1;
    private ImageView imgAbstract2;
    private ImageView imgAbstract3;
    private ImageView imgAbstract4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista =  inflater.inflate(R.layout.fragment_fragmento_menu, container, false);

        if(vista!=null){
            imgAbstract1 = (ImageView) vista.findViewById(R.id.imgAbstract1);
            imgAbstract2 = (ImageView) vista.findViewById(R.id.imgAbstract2);
            imgAbstract3 = (ImageView) vista.findViewById(R.id.imgAbstract3);
            imgAbstract4 = (ImageView) vista.findViewById(R.id.imgAbstract4);
        }

        return vista;
    }


    @Override
    public void onActivityCreated(Bundle datos){
        super.onActivityCreated(datos);

        listaMusic.add(new Artista("Abstract 1", "Carátula Album Abstracto 1"));
        listaMusic.add(new Artista("Abstract 2", "Carátula Album Abstracto 2"));
        listaMusic.add(new Artista("Abstract 3", "Carátula Album Abstracto 3"));
        listaMusic.add(new Artista("Abstract 4", "Carátula Album Abstracto 4"));
        imgAbstract1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onArtistaSelected(listaMusic.get(0));
            }
        });
        imgAbstract2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        imgAbstract3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        imgAbstract4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }

}

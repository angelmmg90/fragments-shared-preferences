package com.fragmentos.seas.fragmentosysharedpreferences;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fragmentos.seas.fragmentosysharedpreferences.beans.Artista;
import com.fragmentos.seas.fragmentosysharedpreferences.fragmentos.FragmentoMenu;
import com.fragmentos.seas.fragmentosysharedpreferences.fragmentos.FragmentArtista;
import com.fragmentos.seas.fragmentosysharedpreferences.interfaces.ArtistaListener;

public class DisplayMusic extends AppCompatActivity
        implements ArtistaListener{

    private FragmentoMenu fragmentoMenu;
    private FragmentArtista fragmentArtista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_music);

        fragmentoMenu = FragmentoMenu.newInstance(null);
        fragmentArtista = FragmentArtista.newInstance(null);

        /*PREPARAR LOS FRAGMENTOS*/
        /*1º Gestor de fragmentos*/
            FragmentManager gestor  = getSupportFragmentManager();
        /*2º Comenzar transacción*/
            FragmentTransaction transaccion = gestor.beginTransaction();
        /*3º Pegar FRAGMENTOS*/
            transaccion.add(R.id.fragmentoMenuImagenes, fragmentoMenu);
            transaccion.add(R.id.fragmentoImagenYBiografia, fragmentArtista);

        transaccion.commit();
        /**/


    }

    @Override
    public void onArtistaSelected(Artista artista) {
        /*Modificaré el 2º fragmento*/

        fragmentArtista.modificarDatosArtista(artista);

        /*Fin*/
    }
}

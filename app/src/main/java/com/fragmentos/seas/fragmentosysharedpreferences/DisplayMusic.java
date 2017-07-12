package com.fragmentos.seas.fragmentosysharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fragmentos.seas.fragmentosysharedpreferences.beans.Artista;
import com.fragmentos.seas.fragmentosysharedpreferences.interfaces.ArtistaListener;

public class DisplayMusic extends AppCompatActivity
        implements ArtistaListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_music);



    }

    @Override
    public void onArtistaSelected(Artista artista) {
        /*Modificaré el 2º fragmento*/


        /*Fin*/
    }
}

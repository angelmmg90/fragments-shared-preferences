package com.fragmentos.seas.fragmentosysharedpreferences.interfaces;


import com.fragmentos.seas.fragmentosysharedpreferences.beans.Artista;

public interface ArtistaListener {
    //Método que se desencadena cuando el usuario selecciona una imagen
    // y pueda notificar el evento para cambiar la imagen y el texto del segundo fragmento

    public void onArtistaSelected(Artista artista);

}

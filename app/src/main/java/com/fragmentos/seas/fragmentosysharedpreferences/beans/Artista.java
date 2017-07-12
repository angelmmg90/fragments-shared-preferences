package com.fragmentos.seas.fragmentosysharedpreferences.beans;

/**
 * Created by TJ100-VAIO on 13/07/2017.
 */

public class Artista {

    private String nombre;
    private String descripcion;

    public Artista(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

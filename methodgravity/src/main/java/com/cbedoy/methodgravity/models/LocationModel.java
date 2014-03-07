package com.cbedoy.methodgravity.models;

import com.cbedoy.methodgravity.interfaces.IModel;

/**
 * Created by Carlos on 6/03/14.
 */
public class LocationModel implements IModel {
    private String nombre;
    private float longitud;
    private float latitud;
    private String descripcion;
    private String escudo;

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getLatitud() {
        return latitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEscudo() {
        return escudo;
    }

    public String getNombre() {
        return nombre;
    }
}

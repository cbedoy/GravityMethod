package com.cbedoy.methodgravity.models;

import com.cbedoy.methodgravity.interfaces.IModel;

/**
 * Created by Carlos on 6/03/14.
 */
public class LocationModel implements IModel {
    private String nombre;
    private float longitud;
    private float latitud;
    private float costo;
    private String escudo;

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public float getLongitud() {
        return longitud;
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

    public String getEscudo() {
        return escudo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
}

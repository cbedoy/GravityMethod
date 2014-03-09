package com.cbedoy.methodgravity.models;

import android.text.format.DateFormat;

import java.util.Date;

/**
 * Created by Carlos on 6/03/14.
 */
public class ResponseModel extends LocationModel {


    private String messsage;
    private String country;
    private long sunrise;
    private long sunset;
    private String sunsetString;
    private String sunriseString;
    private int id;
    private String main;
    private String description;
    private float temp;
    private float maxTemp;
    private float minTemp;
    private float pressure;
    private float humidity;
    private int error;

    public String getSunriseString() {
        return DateFormat.format("hh:mm:ss", new Date(getSunrise())).toString();
    }

    public String getSunsetString(){
        return DateFormat.format("hh:mm:ss", new Date(getSunset())).toString();
    }

    @Override
    public void setCosto(float costo) {
        super.setCosto(costo);
    }

    @Override
    public void setLongitud(float longitud) {
        super.setLongitud(longitud);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setLatitud(float latitud) {
        super.setLatitud(latitud);
    }

    @Override
    public void setEscudo(String escudo) {
        super.setEscudo(escudo);
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setError(int error) {
        this.error = error;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public void setMaxTemp(float maxTemp) {
        this.maxTemp = maxTemp;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }

    public void setMinTemp(float minTemp) {
        this.minTemp = minTemp;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public long getSunset() {
        return sunset;
    }

    @Override
    public float getCosto() {
        return super.getCosto();
    }

    @Override
    public float getLongitud() {
        return super.getLongitud();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String getEscudo() {
        return super.getEscudo();
    }

    @Override
    public float getLatitud() {
        return super.getLatitud();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getMaxTemp() {
        return maxTemp;
    }

    public float getMinTemp() {
        return minTemp;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemp() {
        return temp;
    }

    public int getError() {
        return error;
    }

    public int getId() {
        return id;
    }

    public long getSunrise() {
        return sunrise;
    }

    public String getCountry() {
        return country;
    }

    public String getDescription() {
        return description;
    }

    public String getMain() {
        return main;
    }

    public String getMesssage() {
        return messsage;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


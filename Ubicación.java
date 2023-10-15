package org.example;

public class Ubicación {
    private String ciudad;
    private float distancia;

    public Ubicación(String ciudad, float distancia) {
        this.ciudad = ciudad;
        this.distancia = distancia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }
}

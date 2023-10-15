package org.example;

public class Vehiculos {
    private String tipoDeVehiculo;
    private float velocidad;

    public Vehiculos(String tipoDeVehiculo, float velocidad) {
        this.tipoDeVehiculo = tipoDeVehiculo;
        this.velocidad = velocidad;

    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(String tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }
}

package org.example;

public class Vehiculos {
    private String tipoDeVehiculo;
    private int velocidad;

    public Vehiculos(String tipoDeVehiculo, int velocidad) {
        this.tipoDeVehiculo = tipoDeVehiculo;
        this.velocidad = velocidad;

    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(String tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }
}

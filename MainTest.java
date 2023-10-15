package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void crearPersona() {
    }

    @org.junit.jupiter.api.Test
    void menuEleccionVehiculo() {
        System.setIn(new java.io.ByteArrayInputStream("1\n".getBytes()));
        Vehiculos vehiculo = Main.menuEleccionVehiculo();
        assertEquals("Auto", vehiculo.getTipoDeVehiculo());
        assertEquals(70, vehiculo.getVelocidad());
    }

    @org.junit.jupiter.api.Test
    void menuEleccionUbicacion() {
        System.setIn(new java.io.ByteArrayInputStream("3\n".getBytes()));
        Ubicación ubicacion = Main.menuEleccionUbicacion();
        assertEquals("Santiago", ubicacion.getCiudad());
        assertEquals(300, ubicacion.getDistancia());
    }

    @org.junit.jupiter.api.Test
    void calcularTiempoDeDemora() {
        Persona juan = new Persona("Juan");
        Vehiculos auto = new Vehiculos("Auto", 70);
        Ubicación santiago = new Ubicación("Santiago", 680);
        float tiempo = Main.calcularTiempoDeDemora(juan, auto, santiago);
        assertEquals(9.714285850524902, tiempo);
    }
}
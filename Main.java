package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido!");
        calcularTiempoDeDemora(crearPersona(),menuEleccionVehiculo(),menuEleccionUbicacion());

    }
    public static Persona crearPersona(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        Persona persona1 = new Persona(nombre);
        return persona1;
    }
    public static Vehiculos menuEleccionVehiculo(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean condicion = true;

        while(condicion) {
            System.out.println("Eliga el vehiculo en el cual se transportara: ");
            System.out.println("1. Elegir Auto");
            System.out.println("2. Elegir Motocicleta");
            System.out.println("3. Elegir Bicicleta");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if(opcion==1){
                Vehiculos auto = new Vehiculos("Auto",70);
                return auto;

            }
            else if(opcion==2){
                Vehiculos motocicleta = new Vehiculos("Motocicleta",100);
                return motocicleta;

            }
            else if(opcion==3){
                Vehiculos bicicleta = new Vehiculos("Bicicleta",15);
                return bicicleta;
            }
        }
        Vehiculos pies = new Vehiculos("a pie", 1);
        return pies;
    }
    public static Ubicación menuEleccionUbicacion(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean condicion = true;

        while(condicion) {
            System.out.println("Eliga su destino:");
            System.out.println("1. Elegir Santiago");
            System.out.println("2. Elegir Pucon");
            System.out.println("3. Elegir Concepcion");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if(opcion==1){
                Ubicación santiago = new Ubicación("Santiago",680);
                return santiago;

            }
            else if(opcion==2){
                Ubicación pucon = new Ubicación("Pucon",100);
                return pucon;

            }
            else if(opcion==3){
                Ubicación concepcion = new Ubicación("Santiago",300);
                return concepcion;
            }
        }
        Ubicación vacio = new Ubicación("nada", 0);
        return vacio;
    }
    public static float calcularTiempoDeDemora(Persona usuario, Vehiculos transporte , Ubicación ciudad){
        float tiempo = ciudad.getDistancia() / transporte.getVelocidad();
        System.out.println("Hola " + usuario.getNombre() + "!, el tiempo de viaje aproximado para llegar a "+ ciudad.getCiudad() +
               " utilizando "+ transporte.getTipoDeVehiculo() + " es de: " + tiempo + " horas.");
        return tiempo;
    }
}
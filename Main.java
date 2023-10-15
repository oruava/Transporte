package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(crearPersona().getNombre());
        System.out.println(menuEleccionVehiculo().getVelocidad());

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
            System.out.println("Menú:");
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
            else{
                System.out.println("Opcion no valida");
                break;
            }
        }
        Vehiculos vacio = new Vehiculos("nada", 0);
        return vacio;
    }
}
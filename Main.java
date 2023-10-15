package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(crearPersona().getNombre());

        }
        public static Persona crearPersona(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        Persona persona1 = new Persona(nombre);
        return persona1;
        }

    }

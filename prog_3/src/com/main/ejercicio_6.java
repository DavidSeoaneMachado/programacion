package com.main;
import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner rellenar= new Scanner(System.in);
        System.out.println("Hola, mi nombre es ");
        String nombre= rellenar.nextLine();
        System.out.println("Mi localidad es ");
        String localidad= rellenar.nextLine();
        System.out.println("Me gusta ");
        String gusto= rellenar.nextLine();
        System.out.println("Hola, mi nombre es " + nombre + ". Soy de " + localidad + "\nMe gusta " + gusto);
    }
}

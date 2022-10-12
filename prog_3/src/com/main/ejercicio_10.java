package com.main;
import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner rellenar = new Scanner(System.in);
        System.out.println("El primer dato es ");
        String d_1= rellenar.nextLine();
        System.out.println("El segundo dato es ");
        String d_2= rellenar.nextLine();
        System.out.println("El tercer dato es ");
        String d_3= rellenar.nextLine();
        if (d_1.equals(d_2) | d_1.equals(d_3) | d_2.equals(d_3)) {
            System.out.println("Alguno de los datos coincide con otro");}
        else {
            System.out.println("Ninguna coincidencia");
        }
    }
}

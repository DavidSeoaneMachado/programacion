package com.main;
import java.util.Scanner;

public class ejercicio_12 {
    public static void main(String[] args) {
        Scanner rellenar = new Scanner(System.in);
        System.out.println("Tu edad es ");
        int edad= rellenar.nextInt();
        int edad_minima = 18;
        boolean carnet=edad>=edad_minima? true:false;
        System.out.println(" Puedes tener carnet? " + carnet);}
    }

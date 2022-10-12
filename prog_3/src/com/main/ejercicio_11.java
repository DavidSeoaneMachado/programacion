package com.main;
import java.util.Scanner;

public class ejercicio_11 {
    public static void main(String[] args) {
        Scanner rellenar = new Scanner(System.in);
        System.out.println("El primer valor es ");
        double v1= rellenar.nextDouble();
        double v2= ++v1;
        System.out.println(v2);
        System.out.println("El segundo valor es ");
        double v3= rellenar.nextDouble();
        double v4= v3*v2;
        System.out.println(v4);
    }
}

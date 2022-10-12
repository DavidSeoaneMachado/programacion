package com.main;
import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner rellenar= new Scanner(System.in);
        System.out.println("EL radio es ");
        int radio= rellenar.nextInt();
        final double PI = 3.1415;
        double area = PI * (radio * radio);
        System.out.println("El area es igual a " + area );
        double longitud = 2 * PI * radio;
        System.out.println("La longitud es igual a " + longitud );
    }
}

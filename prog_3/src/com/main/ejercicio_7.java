package com.main;
import java.util.Scanner;

public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner rellenar= new Scanner(System.in);
        System.out.println("El primer valor es ");
        double valor_1= rellenar.nextDouble();
        System.out.println("El segundo valor es ");
        double valor_2= rellenar.nextDouble();
        double modulo= valor_1%valor_2;
        System.out.println("El modulo de ambos es " + modulo);
    }
}

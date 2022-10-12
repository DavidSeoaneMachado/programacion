package com.main;
import java.util.Scanner;

public class ejercicio_8 {
    public static void main(String[] args) {
        Scanner rellenar = new Scanner(System.in);
        System.out.println("El primer numero es ");
        int n1 = rellenar.nextInt();
        System.out.println("El segundo numero es ");
        int n2 = rellenar.nextInt();
        if (n1 == n2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
}

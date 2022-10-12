package com.main;
import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner rellenar= new Scanner(System.in);
        System.out.println("La base es ");
        int base= rellenar.nextInt();
        System.out.println("La altura es ");
        int altura= rellenar.nextInt();
        int area = base * altura;
        System.out.println("El area es igual a " + area );
    }
}

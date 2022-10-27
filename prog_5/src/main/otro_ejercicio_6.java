package main;
import java.util.Scanner;

public class otro_ejercicio_6 {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("Introduce la primera cifra ");
        float cifra_1 = cubrir.nextInt();

        Scanner rellenar = new Scanner(System.in);
        System.out.println("Introduce el simbolo de la operacion a realizar (+,-,*,/ ");
        String simbolo = rellenar.nextLine();

        System.out.println("Introduce la segundo cifra ");
        float cifra_2 = cubrir.nextInt();

        if (simbolo.contains("+")){
         float resultado =  cifra_1 + cifra_2;
            System.out.println("El resultado de " + cifra_1 + simbolo + cifra_2 + " es " + resultado);

        } else if (simbolo.contains("-")) {
            float resultado =  cifra_1 - cifra_2;
            System.out.println("El resultado de " + cifra_1 + simbolo + cifra_2 + " es " + resultado);
        }
        else if (simbolo.contains("*")) {
            float resultado =  cifra_1 * cifra_2;
            System.out.println("El resultado de " + cifra_1 + simbolo + cifra_2 + " es " + resultado);
        }
        else if (simbolo.contains("/")) {
            float resultado =  cifra_1 / cifra_2;
            System.out.println("El resultado de " + cifra_1 + simbolo + cifra_2 + " es " + resultado);
        }
        else {
            System.out.println("Introduce los datos correctamente");
        }
    }
}

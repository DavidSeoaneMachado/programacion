package main;
import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {

        float cifra_1, cifra_2, suma, resta, multi, div;
        String operacion;

        Scanner cubrir = new Scanner(System.in);
        System.out.println("Introduce la primera cifra ");
        cifra_1 = cubrir.nextInt();

        Scanner rellenar = new Scanner(System.in);
        System.out.println("Introduce el tipo de operacion a realizar (+,-,*,/) ");
        operacion = rellenar.nextLine();

        System.out.println("Introduce la segunda cifra ");
        cifra_2 = cubrir.nextInt();

        switch (operacion) {
            case "+": suma = cifra_1+cifra_2;
                System.out.println(suma);
                break;
            case "-": resta = cifra_1-cifra_2;
                System.out.println(resta);
                break;
            case "*": multi = cifra_1*cifra_2;
                System.out.println(multi);
                break;
            case "/": div = cifra_1/cifra_2;
                System.out.println(div);

        }


    }
}

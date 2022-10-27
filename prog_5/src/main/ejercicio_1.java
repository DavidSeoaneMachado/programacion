package main;
import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("Introduce el primer numero ");
        int numero_1 = cubrir.nextInt();
        System.out.println("Introduce el segundo numero ");
        int numero_2 = cubrir.nextInt();
        boolean resultado;

        if (numero_1%numero_2==0){
            resultado = true;
        } else {
            resultado = false;
        }

        System.out.println(resultado);
    }


    }


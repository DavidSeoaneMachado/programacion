package semana8;

import java.util.Scanner;

public class objet5 {

    public static void main(String[] args) {

        Scanner cubrir = new Scanner(System.in);
        System.out.println("Adivina el numero secreto!!. Introduce un numero.");
        int numero = cubrir.nextInt();
        ejercicio5 ejer5 = new ejercicio5();
        ejercicio5.juego(numero);


    }
}

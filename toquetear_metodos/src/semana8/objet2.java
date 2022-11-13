package semana8;

import java.util.Scanner;

public class objet2 {

    public static void main(String[] args) {

        System.out.println("Establece un maximo y un minimo sobre los que recibir la cifra.");
        Scanner cubrir = new Scanner(System.in);
        System.out.println("Establece el maximo.");
        int max = cubrir.nextInt();
        System.out.println("Establece el minimo.");
        int min = cubrir.nextInt();

        ejercicio2 ejer2 = new ejercicio2();

        ejercicio2.Azar(max, min);


    }
}

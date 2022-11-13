package semana8;

import java.util.Scanner;

public class objet4 {

    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        ejercicio4 ejer4 = new ejercicio4();

        System.out.println("Introduce una cadena de caracteres");
        String cadena = cubrir.nextLine();
        ejercicio4.cadenaCaracteres(cadena);
        String cadena1_2 = ejercicio4.cadenaCaracteres(cadena);
        System.out.println(cadena1_2);

        System.out.println("Introduce de nuevo una cadena de caracteres");
        String cadena2 = cubrir.nextLine();
        int cadena2_2 = ejercicio4.valorEntero(cadena2);
        System.out.println(cadena2_2);

        System.out.println("Introduce la ultima cadena de caracteres");
        String cadena3 = cubrir.nextLine();
        ejercicio4.mostrarPatanlla(cadena3);


    }
}

package main;
import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres ");
        String cadena = cubrir.nextLine();

      for (int i=0; i<cadena.length(); i++){
          System.out.println(cadena.charAt(i));

      }
    }
}
package main;
import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner cubrir= new Scanner(System.in);
        float n;
        float suma_num_introd= 0;
        int total_de_numeros_introducibles = 11;

        for (int i=1;i<total_de_numeros_introducibles;i++){
            System.out.println("El total de valores hasta ahora es "+ suma_num_introd + " Introduce/añade un valor.");
            n = cubrir.nextFloat();
            suma_num_introd = suma_num_introd + n; //esto parte en 0 y cada vez que se introduce un numero en el bucle o contador se suma al suma_num_introd//
            float media = suma_num_introd/i;
            System.out.println("Has introducido un " + n + ". La media de los valores introducidos por el usuario es: "+media);

        }
    }
}

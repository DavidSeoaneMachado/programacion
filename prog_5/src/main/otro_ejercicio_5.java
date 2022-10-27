package main;
import java.util.Scanner;

public class otro_ejercicio_5 {
    public static void main(String[] args) {
        float acum = 1; //acumulado
        float numeros = 0;
        Scanner cubrir = new Scanner(System.in);
        System.out.println("Introduce una cantidad de numeros para la media ");
        float cn = cubrir.nextFloat();

        while (acum<=cn){
            System.out.println("Ingrese la nota numero " + acum);
            float n = cubrir.nextFloat();
            numeros += n;
            acum ++;

        }
        float promedio = numeros /cn;
        System.out.println("El promedio es " + promedio);
    }
}

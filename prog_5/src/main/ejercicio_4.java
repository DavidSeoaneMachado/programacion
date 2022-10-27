package main;
import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("Introduce la base ");
        int lado = cubrir.nextInt();
        System.out.println("Introduce la altura ");
        int altura = cubrir.nextInt();
        int calculoArea = lado*altura;
        System.out.println("El area es " + calculoArea);
    }
}

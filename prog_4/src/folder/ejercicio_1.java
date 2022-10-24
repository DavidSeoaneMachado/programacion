package folder;
import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner rellenar= new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero= rellenar.nextInt();
        if (numero>=10){
            System.out.println( numero + " es mayor (o igual) que 10");
        } else {
            System.out.println( numero +  " menor que 10");
        }

    }
}


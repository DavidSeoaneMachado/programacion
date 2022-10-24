package folder;
import java.util.Scanner;

public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner rellenar = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto o frase ");
        String frase = rellenar.nextLine();
        if (frase.length() % 2 == 0){
            System.out.println("El numero de caracteres de la frase es par");
        }
        else {
            System.out.println("El numero de caracteres de la frase es impar");
        }
    }
}

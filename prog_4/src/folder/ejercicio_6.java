package folder;
import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner rellenar = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = rellenar.nextInt();
        if (numero % 2 == 0){
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
    }
}

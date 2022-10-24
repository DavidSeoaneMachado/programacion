package folder;
import java.util.Scanner;

public class ejercicio_2 {

    public static void main(String[] args) {
        Scanner rellenar = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra= rellenar.nextLine();
        if (palabra.contains("b")) {
            System.out.println("La palabra " + palabra+ " contiene la letra b ") ;
        } else {
            System.out.println("La palabra " + palabra+ " no contiene la letra b ") ;
        }
    }


}

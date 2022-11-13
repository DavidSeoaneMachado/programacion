package semana8;
import java.util.Scanner;

public class ejercicio5 { //La clase deberia llamarse Juego segun el enunciado del ejercicio.//

    public static void juego(int cifra1) {
        Scanner cubrir = new Scanner(System.in);
        int cifra2 = (int) (Math.random() * 100);

        for (int i = 1; cifra1 != cifra2; i++) {


            if (cifra1 < cifra2) {
                System.out.println("El numero a adivinar es mayor que " + cifra1 + ". Sigue intentandolo.");
            }
            if (cifra1 > cifra2) {
                System.out.println("El numero a adivinar es menor que " + cifra1 + ". Sigue intentandolo.");
            }

            System.out.println("Introduce un numero, es tu " + (i + 1) + "º intento.");
            cifra1 = cubrir.nextInt();
        }
        System.out.println("Enhorabuena, el numero secreto era el " + cifra2);

    }
}

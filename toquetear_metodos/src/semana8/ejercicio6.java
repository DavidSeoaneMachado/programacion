package semana8;

import java.util.Scanner;

public class ejercicio6 {

    private static int numero = 0;
    private static int aleatorio;
    private static int contador = 5;

    public static void generarNumAleatorio() {

        aleatorio = (int) (Math.random() * 100);
        System.out.println(aleatorio);
    }

    public static void Adivinar() {
        Scanner cubrir = new Scanner(System.in);

        for (int i = 0; contador > 0; i++) {
            System.out.println("Advina el numero. Tienes " + contador + " intentos");
            contador--;
            numero = cubrir.nextInt();
            if (aleatorio > numero) {
                System.out.println("Escribe un numero mayor: ");
            }
            if (aleatorio < numero) {
                System.out.println("Escribe un numero menor: ");
            }
            if (aleatorio == numero) {
                System.out.println("Has acertado, era el " + aleatorio);
                return;
            }
        }
        System.out.println("Has gastado tus 5 intentos. El numero era " + aleatorio);

    }


}
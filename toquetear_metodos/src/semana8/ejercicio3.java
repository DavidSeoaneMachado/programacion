package semana8;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner cubrir = new Scanner(System.in);
        System.out.println("¿Cuantos datos quieres mostrar?");
        int cantiDatos = cubrir.nextInt();
        System.out.println("Establece el rango en el que se van a encontrar tus datos aleatorios.");
        System.out.println("Establece el maximo.");
        int max = cubrir.nextInt();
        System.out.println("Establece el minimo.");
        int min = cubrir.nextInt();

        int [] array = new int[cantiDatos];
        System.out.println("Tus " + cantiDatos + " digitos entre " + max + " y" + min + " son:" );
        for (int i=1; i <= array.length; i++) {
            int aleatorio = (int)Math.floor(Math.random()*(max-min+1)+min);
             for (int j = 0; j<1 ; j++ )  {
                 System.out.println("La "+ i + "º cifra es: "+ aleatorio);
             }


        }
    }
}

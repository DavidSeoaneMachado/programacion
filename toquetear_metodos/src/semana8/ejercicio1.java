package semana8;
import  java.util.Scanner;

public class ejercicio1 {

    public static int[] insertDatosArray () {
        int arra1 = 0;
        System.out.println("Introduce cuantos datos quires que tenga tu array");
        Scanner cubrir = new Scanner(System.in);
        arra1 = cubrir.nextInt();
        int[] numeros = new int[arra1];
        System.out.println("Tu array será de " + arra1 + "digitos");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + "Escribe un digito");
            numeros[i] = cubrir.nextInt();

        }
        return numeros;
    }
    public static void MostrarDatos (int [] arra2){

        System.out.println("Los digitos de tu array son");

        for (int i=0; i<arra2.length; i++)
        {
            System.out.println( "En "+ (i+1) + "º posicion");
            System.out.println(arra2[i] + " ");
        }
    }
}

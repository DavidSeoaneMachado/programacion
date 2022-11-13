package semana8;

import java.util.Scanner;

public class ejercicio4 { //La clase deberia llamarse E_S (entrada/salida) segun el enunciado del ejercicio.//

    public static String cadenaCaracteres (String cadena){
        return cadena;
    }
    public static int valorEntero (String cadena){
        Scanner cubrir = new Scanner(System.in);
        System.out.println("Introduce un valor entero");
        int valor = cubrir.nextInt();
        return valor;
    }

    public static void mostrarPatanlla (String cadena){
        System.out.println(cadena);
    }


}

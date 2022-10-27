package main;
import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("Introduce un numero ");
        int numero = cubrir.nextInt();
        int suma = 0;
        boolean resultado;


        if (numero<=100) {
            for (int i=1; i<100; i++){
                int aux = numero%i;

                if (aux == 0){
                    suma = suma+1;
                }
            }

            if (suma <= 2){
                System.out.println(resultado=true);
            }else {
                System.out.println(resultado=false);
            }



        }

    }


}

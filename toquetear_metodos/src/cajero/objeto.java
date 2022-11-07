package cajero;

import java.util.Scanner;

public class objeto {
    public static void main(String[] args)  {

        metodos met = new metodos();

        met.retirarDinero();
        met.numBilletes();


       String proceso = "";

        Scanner cubrir = new Scanner(System.in);
        System.out.println("¿Deseas continuar realizando operaciones? Si o No? ");
        proceso = cubrir.nextLine();


        while (proceso.equals("Si")) {

            met.retirarDinero();
            met.numBilletes();
            System.out.println("¿Deseas continuar realizando operaciones? Si o No? ");
            proceso = cubrir.nextLine();

        }




    }
}

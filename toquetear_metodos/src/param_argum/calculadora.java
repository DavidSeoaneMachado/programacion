package param_argum;

import java.util.Scanner;

public class calculadora {
    double  suma, resta, multip, div;


    public void sumar (int cifra1, int cifra2 ) { //Parametros: variables o objetos que va a requerir la funcion//
        suma = cifra1 + cifra2;

    }
    public void restar (int cifra1, int cifra2 ) {
        resta = cifra1 - cifra2;
    }
    public void multiplicar (int cifra1, int cifra2 ) {
        multip = cifra1 * cifra2;
    }
    public void dividir (int cifra1, int cifra2 ) {
        div = cifra1 / cifra2;
    }

    public void mostrarResultado (){
        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado de la multiplicacion es " + multip);
        System.out.println("El resultado de la division es " + div);
    }

}

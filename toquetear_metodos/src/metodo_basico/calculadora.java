package metodo_basico;
import java.util.Scanner;

public class calculadora {
    double cifra1, cifra2, suma, resta, multip, div;


    public void leerNumeros () {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("Introduce la primera cifra ");
        cifra1 = cubrir.nextInt();
        System.out.println("Introduce la segunda cifra ");
        cifra2 = cubrir.nextInt();
    }

    public void sumar () {
        suma = cifra1 + cifra2;
    }
    public void restar () {
        resta = cifra1 - cifra2;
    }
    public void multiplicar () {
        multip = cifra1*cifra2;
    }
    public void dividir () {
        div = cifra1/cifra2;
    }

    public void mostrarResultado (){
        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado de la multiplicacion es " + multip);
        System.out.println("El resultado de la division es " + div);
    }

}


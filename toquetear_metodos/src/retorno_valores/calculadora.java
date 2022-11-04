package retorno_valores;

import java.util.Scanner;

public class calculadora {


    public void leerNumeros() {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("Introduce la primera cifra ");
        int cifra1 = cubrir.nextInt();
        System.out.println("Introduce la segunda cifra ");
        int cifra2 = cubrir.nextInt();
    }

    public int sumar(int cifra1, int cifra2) {
        int suma = cifra1 + cifra2;
        return suma;
    }

    public int restar(int cifra1, int cifra2) {

        int resta = cifra1 - cifra2;
        return resta;
    }

    public int multiplicar(int cifra1, int cifra2) {

        int multip = cifra1 * cifra2;
        return multip;
    }

    public int dividir(int cifra1, int cifra2) {

        int div = cifra1 / cifra2;
        return div;
    }

    public void mostrarResultado (int suma, int resta, int multip, int div) {
        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado de la multiplicacion es " + multip);
        System.out.println("El resultado de la division es " + div);
    }

}
package retorno_valores;

import java.util.Scanner;

public class objeto {

    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("Introduce un numero1 ");
        int n1 = cubrir.nextInt();
        System.out.println("Introduce un numero2 ");
        int n2 = cubrir.nextInt();

        calculadora cal = new calculadora();

        //Imprimir los resultados desde un metodo que me retorna un valor dentro de una variable auxiliar//

        int suma = cal.sumar(n1, n2);
        int resta = cal.restar(n1, n2);
        int multiplic = cal.multiplicar(n1, n2);
        int div = cal.dividir(n1, n2);

        cal.mostrarResultado(suma, resta, multiplic, div);


        //Otra forma de imprimir los resultados desde un metodo que me retorna un valor (aqui borrando el metodo mostrar resultados del otro archivo)//

        System.out.println("La suma es "+ cal.sumar(n1, n2));
        System.out.println("La resta es "+ cal.restar(n1, n2));
        System.out.println("La multiplicacion es "+ cal.multiplicar(n1, n2));
        System.out.println("La division es "+ cal.dividir(n1, n2));

    }
}
package param_argum;
import java.util.Scanner;

public class objeto {

    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("Introduce un numero1 ");
        int n1 = cubrir.nextInt();
        System.out.println("Introduce un numero2 ");
        int n2 = cubrir.nextInt();

        calculadora cal = new calculadora();
        cal.sumar(n1, n2); //Argumentos: "valores" que se utilizan para responder a los parametros solicitados//
        cal.restar(n1, n2);
        cal.multiplicar(n1, n2);
        cal.dividir(n1, n2);
        cal.mostrarResultado();


    }
}
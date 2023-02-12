import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce el primero numero de tu operacion");

        Scanner cubrir = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        float num1 = cubrir.nextFloat();
        System.out.print("Introduce el segundo numero: ");
        float num2 = cubrir.nextFloat();
        System.out.println("¿Que operacion quieres realizar? \n1 Suma \n2 Resta \n3 Multiplicación \n4 Division");
        int operacion = cubrir.nextInt();

        Calculadora.calculadora(num1, num2, operacion);
    }

}

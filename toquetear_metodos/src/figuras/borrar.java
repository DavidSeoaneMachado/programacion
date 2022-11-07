package figuras;
import java.util.Scanner;

public class borrar {

    public static double  sumar(double sumando_1, double sumando_2){
        double resultado = 0;
        resultado = sumando_1 + sumando_2;
        return resultado;
    }

    public static double restar(double restando_1, double restando_2){
        double resultado = 0;
        resultado = restando_1 - restando_2;
        return resultado;
    }

    public static double multiplicar(double factor_1, double factor_2){
        double resultado = 0;
        resultado = factor_1 * factor_2;
        return resultado;
    }

    public static double dividir(double divisor, double dividendo){
        double resultado = 0;
        resultado = dividendo / divisor;
        return resultado;
    }

    /*
    Este tipo de construcciones permite elborar peticiones de datos con mensajes propios sin tener que escribir cada una de las piezas
    de forma individual cada vez.
     */
    public static double solicitarValor(String mensaje, Scanner escaner){
        double entrada = 0;
        System.out.println(mensaje);
        entrada = escaner.nextDouble();
        return entrada;
    }


    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String mensaje = "";
        boolean isSalir = false;
        double valor_1 = 0, valor_2 = 0, resultado = 0; //Declaramos las variables en una sola linea, del mismo tipo "Double"
        int operacion = 0; //Necesitamos que sea un entero para poder utilizar el "switch"
        //El bucle while permite detenerlo en cualquier momento
        while (!isSalir){
            mensaje = "Introduce el primer valor: ";
            valor_1 = solicitarValor(mensaje,entrada);

            mensaje = "Introduce el segundo valor: ";
            valor_2 = solicitarValor(mensaje,entrada);

            mensaje = "¿Qué operación vas a hacer\n1- Sumar\n2- Restar\n3- Multiplicar\n4- División\n5- Salir";
            operacion = (int) solicitarValor(mensaje,entrada); //"(tipo) valor" permite transformar el valor de la derecha en el del tipo entre paréntesis. Veremos que se llama "cast"

            //Vamos a dejar el menú en el bucle, se podría hacer otra función para el mismo
            switch(operacion){
                case 1:
                    resultado = sumar(valor_1, valor_2);
                    System.out.println(valor_1 + " + " + valor_2 + " = " + resultado);
                    break;
                case 2:
                    resultado = restar(valor_1, valor_2);
                    System.out.println(valor_1 + " - " + valor_2 + " = " + resultado);
                    break;
                case 3:
                    resultado = multiplicar(valor_1, valor_2);
                    System.out.println(valor_1 + " x " + valor_2 + " = " + resultado);
                    break;
                case 4:
                    resultado = dividir(valor_1, valor_2);
                    System.out.println(valor_1 + " / " + valor_2 + " = " + resultado);
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    isSalir = true;
                    break;
                default:
                    System.out.println("Esa opción no está disponible");
                    break;
            }
        }
    }
}
/**
 * Librería para emular una calculadora
 *
 * @author David Seoane
 * @version 0.1
 */

public class Calculadora {

    /**
     * opciones para determinar la operación de la calculadora
     */
    public static final int SUMA = 1;
    public static final int RESTA = 2;
    public static final int MULTIPLICACION = 3;
    public static final int DIVISION = 4;
    public static float RESULTADO = 0;
    /**fin de las opciones para la calculadora*/


    /**
     * Método para obtener numeros enteros por consola
     *
     * @param dato1
     * @param dato2
     * @param operacion
     * @return si es true: correcto si no false
     */
    public static float calculadora(float dato1, float dato2, int operacion) {
        switch (operacion) {
            case SUMA:
                try {
                    float suma = dato1 + dato2;
                    System.out.println("El resultado de la suma es: " + suma);
                    RESULTADO=suma;
                } catch (Exception calcular) {
                    System.out.println("Error al realizar la operacion");
                    System.out.println(calcular.getMessage());
                }
                break;
            case RESTA:
                try {
                    float resta = dato1 - dato2;
                    System.out.println("El resultado de la resta es: " + resta);
                    RESULTADO=resta;
                } catch (Exception calcular) {
                    System.out.println("Error al realizar la operacion");
                    System.out.println(calcular.getMessage());
                }
                break;
            case MULTIPLICACION:
                try {
                    float multiplicacion = dato1 * dato2;
                    System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
                    RESULTADO=multiplicacion;
                } catch (Exception calcular) {
                    System.out.println("Error al realizar la operacion");
                    System.out.println(calcular.getMessage());
                }
                break;
            case DIVISION:
                try {
                    float division =(Integer) Math.round(dato1/dato2);/*con Math.round conseguimos que solo nos devuelva la parte entera de la division*/
                    System.out.println("El resultado de la division es: " + division);
                    RESULTADO=division;
                } catch (Exception calcular) {
                    System.out.println("Error al realizar la operacion");
                    System.out.println(calcular.getMessage());
                }
                break;
        }
        return RESULTADO;

    }
}

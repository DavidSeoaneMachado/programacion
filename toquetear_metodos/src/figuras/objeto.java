package figuras;

import java.util.Scanner;

public class objeto {
    public static void main(String[] args) {
        Scanner rellenar = new Scanner(System.in);
        System.out.println("Introduce la figura a la cual calcular el area");
        String figura = rellenar.nextLine();

        calculadora cal = new calculadora();

        cal.leerFigura(figura);
        cal.leerDatos(figura);


    }
}

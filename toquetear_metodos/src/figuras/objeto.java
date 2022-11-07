package figuras;
import java.util.Scanner;

public class objeto {
    public static void main(String[] args) {
        Scanner rellenar = new Scanner(System.in);
        System.out.println("Introduce la figura a la cual calcular el area");
        String figura = rellenar.nextLine();

        calculadora cal = new calculadora();

        cal.leerFigura(figura);

        Scanner cubrir = new Scanner(System.in);
        System.out.println("Introduce las dos cifras");
        int numero1 = rellenar.nextInt();
        int numero2 = rellenar.nextInt();

        cal.leerDatos();



    }
}

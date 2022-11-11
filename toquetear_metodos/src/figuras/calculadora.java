package figuras;
import java.util.Scanner;

public class calculadora {

    String tri = "triangulo";
    String rec = "rectangulo";
    String pen = "pentagono";
    String hex = "hexagono";
    String figura;

    public void leerFigura(String figu) {

        if (figu.equals(tri)) {
            System.out.println("Introduce la base y la altura");
            figura = "triangulo";

        } else if (figu.equals(rec)) {
            System.out.println("Introduce la base y la altura");
            figura = "rectangulo";

        } else if (figu.equals(pen)) {
            System.out.println("Introduce el perimetro y la apotema");
            figura = "pentagono";

        } else if (figu.equals(hex)) {
            System.out.println("Introduce el perimetro y la apotema");
            figura = "hexagono";
        }
    }
    public void leerDatos(String figura) {

        Scanner rellenar = new Scanner(System.in);
        System.out.println("Introduce una cifra y despues la otra");
        int numero1 = rellenar.nextInt();
        int numero2 = rellenar.nextInt();

        switch (figura) {
            case "triangulo":
                System.out.println("El area del triangulo es " + numero1 * numero2 / 2);
                break;
            case "rectangulo":
                System.out.println("El area del rectangulo es " + numero1 * numero2);
                break;
            case "pentagono":
                System.out.println("El area del pentagono es " + numero1 * numero2);
                break;
            case "hexagono":
                System.out.println("El area del hexagono es " + numero1 * numero2 / 2);
                break;
        }
    }
}


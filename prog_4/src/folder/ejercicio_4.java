package folder;
import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner rellenar = new Scanner(System.in);
        String tri = "triangulo";
        String rec = "rectangulo";
        String pen = "pentagono";
        String hex = "hexagono";
        System.out.println("Las figuras disponibles son: " + "\n" + tri + "\n" + rec + "\n" + pen + "\n" + hex  );
        String figura = rellenar.nextLine();
        if (figura.equals(tri)){
            System.out.println("Ahora introduce primero la base y luego la altura para calcular el area");
            int base = rellenar.nextInt();
            int altura = rellenar.nextInt();
            System.out.println("El area del triangulo es " + base*altura/2);
        }
        else if (figura.equals(rec)){
            System.out.println("Ahora introduce primero la base y luego la altura para calcular el area");
            int base = rellenar.nextInt();
            int altura = rellenar.nextInt();
            System.out.println("El area del rectangulo es " + base*altura);
        }
        else if (figura.equals(pen)){
            System.out.println("Ahora introduce primero el perimetro y luego la apotema para calcular el area");
            int per = rellenar.nextInt();
            int apo = rellenar.nextInt();
            System.out.println("El area del pentagono es " + per*apo/2);
        }
        else if (figura.equals(hex)){
            System.out.println("Ahora introduce primero el perimetro y luego la apotema para calcular el area");
            int per = rellenar.nextInt();
            int apo = rellenar.nextInt();
            System.out.println("El area del hexagono es " + per*apo/2);
        } else {
            System.out.println("La figura introducida no es ninguna de las disponibles");
        }
    }
}

package folder;
import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner rellenar = new Scanner(System.in);
        String man = "Manzana";
        String pla = "Platano";
        String per = "Pera";
        System.out.println("Los productos disponibles son: " + "\n" + man + "\n" + pla + "\n" + per + "\n" + "Selecciona uno para conocer su precio");
        String producto = rellenar.nextLine();
        if (producto.equals(man)) {
            System.out.println("La manzana vale 2 euros");
        }else if (producto.equals(pla)) {
            System.out.println("El platano vale 8 euros");
        }else if (producto.equals(per)) {
            System.out.println("La pera vale 2.60 euros");
        } else {
            System.out.println("El nombre introducido no se corresponde con ningun producto");
        }

    }
}

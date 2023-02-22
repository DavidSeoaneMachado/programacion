import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Que deseas hacer?");
        System.out.println("\n1 Crear una nueva liga. \n2 Jugar la liga. \n3 Eliminar la liga actual. \n4 Salir. ");
        Scanner rellenar = new Scanner(System.in);
        int menu = rellenar.nextInt();

        boolean salir = false;

        do {
            switch (menu){
                case 1:
                    System.out.println();

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    salir == true;
                    break;
            }

        } while (salir == false);

    }
}

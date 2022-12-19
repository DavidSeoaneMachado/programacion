package Enunciado1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        int salir = 1;
        Contador contador = new Contador();

        do {
            System.out.println("¿Que quieres hacer? \n1 Introducir valores al contador \n2 Salir de programa");
            int menu = cubrir.nextInt();

            switch (menu){
                case 1:
                    System.out.println("Introduce el valor que quieres añadir al contador.");
                    int valor = cubrir.nextInt();
                    contador.operaciones_rotas(valor);
                    break;

                case 2:
                    salir=0;
            }

        } while (salir!=0);

    }

}

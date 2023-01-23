import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        String nombre = "";
        String apellido = "";
        int telefono = 0;
        int perfiles = 0;
        Scanner cubrir = new Scanner(System.in);

        System.out.println("Numero de perfiles en la agenda?¿");
        perfiles = cubrir.nextInt();
        cubrir.nextLine();
        System.out.println();

        for (int i = 0; i < perfiles; i++) {
            try {
                System.out.println("Introduce nombre");
                nombre = cubrir.nextLine();
            } catch (InputMismatchException excepcion) {
                System.out.println("Error al añadir el nombre");

            }
            try {
                System.out.println("Introduce apellido");
                apellido = cubrir.nextLine();

            } catch (InputMismatchException exception) {
                System.out.println("Error al añadir el apellido");

            }
            try {
                System.out.println("Introduce telefono");
                telefono = cubrir.nextInt();
                cubrir.nextLine();
                System.out.println();
            } catch (InputMismatchException excepcion) {
                System.out.println("Error al añadir el telefono");

            } finally {
                System.out.println("Perfil añadido correctamente");
            }
        }

        Perfil perfil = new Perfil(nombre, apellido, telefono);
        System.out.println(perfil.toString());
        Agenda agenda = new Agenda(perfiles);
        System.out.println(agenda.toString());


    }
}


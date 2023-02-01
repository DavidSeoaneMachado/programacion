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
        Agenda agenda = new Agenda(perfiles);

        for (int i = 0; i < perfiles; i++) {
            try {
                System.out.println("Introduce el nombre del " + (i + 1) + "º perfil");
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
                System.out.println("Perfil añadido.");
            }

            Perfil perfil = new Perfil(nombre, apellido, telefono);
            agenda.añadirPerfiles(perfil, i);
        }

        System.out.println(agenda);

    }
}


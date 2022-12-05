import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        Scanner rellenar = new Scanner(System.in);

        do {

            System.out.println("¿De cuantas plazas quieres que sea tu parking? Introduce un numero.");
            int plazas = cubrir.nextInt();
            Parking parking = new Parking(plazas);

            System.out.println("¿Como quieres que sea la entrada de vehiculos? \n1 Manual \n2 Aleatoria ");
            int manual_aleatoria = cubrir.nextInt();
            // parking.introducir_coches(manual_aleatoria);
            Vehiculo[] arrayAux = parking.introducir_coches(manual_aleatoria);
            parking.mostrar_parking(arrayAux);

            parking.buscar_por_indice(arrayAux);

        } while ()




    }
}

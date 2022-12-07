import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);

        System.out.println("¿De cuantas plazas quieres que sea tu parking? Introduce un numero.");
        int plazas = cubrir.nextInt();
        Parking parking = new Parking(plazas);
        System.out.println("¿Como quieres que sea la entrada de vehiculos? \n1 Manual \n2 Aleatoria ");
        int manual_aleatoria = cubrir.nextInt();
        Vehiculo[] arrayAux = parking.introducir_coches(manual_aleatoria);
        boolean salida;
        do {
            System.out.println("¿Que deseas hacer? \n1 Mostrar todos los registros del parking. \n2 Buscar vehiculos por plazas. \n3 Buscar vehiculos por matricula. \n4 Retirar un vehiculo del parking. \n5 Salir del programa. ");
            int menu = cubrir.nextInt();

            switch (menu) {

                case 1:
                    parking.mostrar_parking(arrayAux);
                    break;
                case 2:
                    parking.buscar_por_indice(arrayAux);
                    break;
                case 3:
                    parking.buscar_por_matricula(arrayAux);
                    break;
                case 4:
                    parking.retirar_vehiculos(arrayAux);
                    break;
                case 5:
                    System.out.println("Hasta la proxima!");
                    return;

            }

        } while (salida = true);


    }
}

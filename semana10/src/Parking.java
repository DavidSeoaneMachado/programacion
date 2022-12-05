import java.util.Scanner;

public class Parking {
    public int tamaño_parking;
    public Vehiculo[] parking;
    Scanner cubrir = new Scanner(System.in);

    public Parking(int tamaño_parking) {
        this.tamaño_parking = tamaño_parking;
        parking = new Vehiculo[tamaño_parking];
    }

    public Vehiculo[] introducir_coches(int manu_o_aleat) {

        if (manu_o_aleat == 1) {

            System.out.println("Has selecionado entrada de vehiculos manual.");

            for (int i = 0; i < parking.length; i++) {

                System.out.println("Introduce el vehiculo que ocupa la plaza " + (i + 1) + " del parking (coche1 o camion2). ");
                int valor_vehiculo = cubrir.nextInt();
                Vehiculo vehic = new Vehiculo(valor_vehiculo);

                if (valor_vehiculo == 1) {
                    parking[i] = vehic;
                }
                if (valor_vehiculo == 2) {

                    if (i < (parking.length - 1)) {
                        parking[i] = vehic;
                        parking[i + 1] = vehic;
                        i++;
                    } else {
                        System.out.println("No hay sitio suficiente para introducir un camion en el parking. La ultima seleccion quedará anulada.\n ¿Quieres introducir un coche en su lugar?");
                    }
                }
            }
            System.out.println("La seleccion del parking esta completa.");
        }

        if (manu_o_aleat == 2) {
            System.out.println("Has selecionado entrada de vehiculos aleatoria.");
            for (int i = 0; i < parking.length; i++) {

                int valor_vehiculo = (int) Math.floor(Math.random() * (2 - 1 + 1) + 1);
                Vehiculo vehic = new Vehiculo(valor_vehiculo);

                if (valor_vehiculo == 1) {
                    parking[i] = vehic;

                }
                if (valor_vehiculo == 2) {
                    if (i < (parking.length - 1)) {
                        parking[i] = vehic;
                        parking[i + 1] = vehic;
                        i++;
                    } else {
                        System.out.println("No hay sitio suficiente para introducir un camion en el parking. La ultima seleccion quedará anulada.\n ¿Quieres introducir un coche en su lugar? \n1 Si \n2 No");
                    }
                }
            }
            System.out.println("La seleccion del parking esta completa.");

        }
        return parking;
    }

    public void mostrar_parking(Vehiculo[] arra) {
        for (int i = 0; i < arra.length; i++) {
            if ((arra[i] != null) && (arra[i].getTipo() == "coche (ocupa 1 plaza)")) {
                System.out.println("La " + (i + 1) + "º plaza del parking la ocupa" + arra[i]);
            }
            if ((arra[i] != null) && (arra[i].getTipo() == "camion (ocupa 2 plazas)")) {
                System.out.println("La " + (i + 1) + "º y " + (i + 2) + "º plazas del parking las ocupa" + arra[i]);
                i++;
            }
            if ((arra[i] == null)) {
                System.out.println("Queda la " + (arra.length) + "º plaza libre, ya que solo entraba un coche y se solicitó introducir un camion");
            }
        }

    }

    public void buscar_por_indice(Vehiculo[] arra) {
        System.out.println("¿De que plaza quieres ver el vehiculo?");
        int indice = cubrir.nextInt();
        if (arra[indice-1] != null){
        System.out.println("La " + indice + "º plaza del parking la ocupa" + arra[indice-1]);
    }
        if (arra[indice-1] == null || indice> arra.length) {
            System.out.println("La " + indice + "º plaza del parking no esta ocupada por ningun vehiculo");

        }
        }
}

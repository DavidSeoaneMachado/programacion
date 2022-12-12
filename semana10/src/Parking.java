import java.util.Scanner;

public class Parking {
    private int tamaño_parking;
    private Vehiculo[] parking;
    Scanner cubrir = new Scanner(System.in);
    Scanner rellenar = new Scanner(System.in);

    public Parking(int tamaño_parking) {
        this.tamaño_parking = tamaño_parking;
        parking = new Vehiculo[tamaño_parking];
    }

    public Vehiculo[] introducir_coches(int manu_o_aleat) {

        if (manu_o_aleat == 1) {

            System.out.println("Has selecionado entrada de vehiculos manual.");

            for (int i = 0; i < parking.length; i++) {

                System.out.println("Introduce el vehiculo que ocupa la plaza " + (i + 1) + " del parking. \n1 Coche \n2 Camion ");
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
                        System.out.println("No hay sitio suficiente para introducir un camion en el parking. La ultima seleccion quedará anulada.\n ¿Quieres introducir un coche en su lugar? \n1 Si \n2 No");
                        int coche_por_camion = cubrir.nextInt();
                        if (coche_por_camion == 1) {
                            vehic.setTipo("coche (ocupa 1 plaza) ");
                            Vehiculo vehiculo = new Vehiculo(1);
                            parking[parking.length-1] = vehic;
                        }
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
                        int coche_por_camion = cubrir.nextInt();
                        if (coche_por_camion == 1) {
                            vehic.setTipo("coche (ocupa 1 plaza) ");
                            parking[parking.length - 1] = vehic;
                            System.out.println("-Se ha seleccionado introducir" + vehic);
                        }
                    }
                }
            }
            System.out.println("La seleccion del parking esta completa.");
        }
        return parking;
    }

    public void mostrar_parking(Vehiculo[] arra) {
        for (int i = 0; i < arra.length; i++) {
            if ((arra[i] != null) && (arra[i].getTipo() == "coche (ocupa 1 plaza) ")) {
                System.out.println("La " + (i + 1) + "º plaza del parking la ocupa" + arra[i]);
            }
            if ((arra[i] != null) && (arra[i].getTipo() == "camion (ocupa 2 plazas) ")) {
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
        if (arra[indice - 1] != null) {
            System.out.println("La " + indice + "º plaza del parking la ocupa" + arra[indice - 1]);
        }
        if (arra[indice - 1] == null || indice > arra.length) {
            System.out.println("La " + indice + "º plaza del parking no esta ocupada por ningun vehiculo");
        }
    }

    public void buscar_por_matricula(Vehiculo[] arra) {
        System.out.println("¿Que matricula quieres buscar?");
        String matricula = cubrir.nextLine();
        for (int i = 0; i < arra.length; i++) {
            if (arra[i].getMatricula().equals(matricula)) {
                if (arra[i + 1].getMatricula().equals(matricula)) {
                    System.out.println("La matricula " + matricula + " se corresponde con" + arra[i] + ". Ocupa las plazas " + (i - 1) + "º Y " + i);
                    i++;
                } else {
                    System.out.println("La matricula " + matricula + " se corresponde con" + arra[i] + ". Ocupa la plaza " + (i - 1) + "º");
                }
            }
        }
    }

    public void retirar_vehiculos(Vehiculo[] arra) {
        System.out.println("¿Como quieres retirar el vehiculo? \n1 Por plaza \n2 Por matricula \n3 De manera aleatoria");
        int modo_retirada = cubrir.nextInt();
        switch (modo_retirada) {

            case 1:
                System.out.println("¿Que plaza quieres dejar vacia?");
                int plaza_vacia = cubrir.nextInt();
                String var_para_borrar = "";
                for (int i = 0; i < arra.length; i++) {
                    var_para_borrar = arra[plaza_vacia - 1].getMatricula();
                    if (arra[i].getMatricula() == var_para_borrar) {

                        if (arra[i].getMatricula() == arra[i + 1].getMatricula()) {
                            System.out.println("Se ha retirado un vehiculo de las plazas " + (i + 1) + " y " + (i + 2) + " con matricula: " + arra[i].getMatricula());
                            arra[i].setTipo("retirado, ");
                            arra[i].setMatricula("-");
                            i++;
                        } else {
                            System.out.println("Se ha retirado un vehiculo de la plaza " + (i + 1) + "con matricula: " + arra[i].getMatricula());
                            arra[i].setTipo("retirado, ");
                            arra[i].setMatricula("-");
                        }
                    }
                }
                break;
            case 2:
                System.out.println("¿Que matricula (con su correspondiente vehiculo) quieres retirar del parking?");
                String matricula_a_borrar = rellenar.nextLine();
                for (int i = 0; i < arra.length; i++) {
                    if (arra[i].getMatricula().equals(matricula_a_borrar)) {
                        if (i < (arra.length - 1)) {
                            if (arra[i].getMatricula().equals(arra[i + 1].getMatricula())) {
                                System.out.println("Se ha retirado un vehiculo de las plazas " + (i + 1) + " y " + (i + 2) + " con matricula: " + arra[i].getMatricula());
                                arra[i].setTipo("retirado, ");
                                arra[i].setMatricula("-");
                                i++;
                            } else {
                                System.out.println("Se ha retirado un vehiculo de la plaza " + (i + 1) + " con matricula: " + arra[i].getMatricula());
                                arra[i].setTipo("retirado, ");
                                arra[i].setMatricula("-");
                            }
                        } else {
                            System.out.println("Se ha retirado un vehiculo de la plaza " + (i + 1) + " con matricula: " + arra[i].getMatricula());
                            arra[i].setTipo("retirado, ");
                            arra[i].setMatricula("-");
                        }
                    }
                }
                break;
            case 3:
                int aleat_para_retirar = (int) Math.floor(Math.random() * ((arra.length - 1) - 0 + 1) + 0);
                for (int i = 0; i < arra.length; i++) {
                    if (arra[aleat_para_retirar].getMatricula() != "-") {
                        if (arra[i].getMatricula() == arra[aleat_para_retirar].getMatricula()) {
                            if (arra[i + 1].getMatricula() == arra[aleat_para_retirar].getMatricula()) {
                                System.out.println("Se ha retirado un vehiculo de las plazas " + (i + 1) + " y " + (i + 2) + " con matricula: " + arra[aleat_para_retirar].getMatricula());
                                arra[i].setTipo("retirado, ");
                                arra[i].setMatricula("-");
                                arra[i + 1].setTipo("retirado, ");
                                arra[i + 1].setMatricula("-");
                                i++;
                            } else {
                                System.out.println("Se ha retirado un vehiculo de la plaza " + (i + 1) + " con matricula: " + arra[aleat_para_retirar].getMatricula());
                                arra[i].setTipo("retirado, ");
                                arra[i].setMatricula("-");
                            }
                        }
                    }
                }
        }
    }
}


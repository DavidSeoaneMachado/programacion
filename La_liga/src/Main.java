import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner rellenar = new Scanner(System.in);
        Scanner cubrir = new Scanner(System.in);

        boolean salir = false;
        boolean salirsubmenu = false;
        boolean ligacreada = false;
        int jornada = 1;

        Liga_futbol liga = new Liga_futbol();

        do {
            System.out.println("Menú principal.");
            System.out.println("\n1 Crear una nueva liga. \n2 Jugar la liga. \n3 Eliminar la liga actual. \n4 Salir. ");
            int menu = rellenar.nextInt();
            switch (menu) {
                case 1: //Crear nueva liga
                    System.out.println("Dale un nombre a tu liga.");
                    String nombreliga = cubrir.nextLine();
                    liga.crear_liga(nombreliga);
                    ligacreada = true;
                    break;
                case 2: //Jugar la liga
                   // if (ligacreada == true) {

                        do {
                            System.out.println("Selecciona una opcion. \n1 Siguiente jornada (simula la jornada) \n2 Consultar clasificacion \n3 Pausar liga (volver al menu principal)");
                            int submenu = rellenar.nextInt();
                            switch (submenu) {
                                case 1:
                                    salirsubmenu = false;
                                    liga.simular_liga();
                                    int submenut = rellenar.nextInt();
                                    liga.calcular_jornada(jornada, liga.simular_liga());
                                    jornada++;
                                    break;
                                case 2:
                                    salirsubmenu = false;
                                    break;

                                case 3:
                                    salirsubmenu = true;
                                    break;
                            }
                        } while (salirsubmenu == false);
                    /*} else {
                        System.out.println("Primero debes crear una liga.");
                        salirsubmenu = true;
                    } */
                    break;
                case 3: //Eliminar liga
                    if (ligacreada == true) {
                        System.out.println("Estas segur@ de que deseas eliminar la liga actual? \n1 Si, estoy segur@. \n2 No, mejor no.");
                        int borrarliga = 0;
                        borrarliga = rellenar.nextInt();
                        if (borrarliga == 1) {
                            System.out.println("Hasta la proxima!!");
                            salir = true;
                        }
                    } else {
                        System.out.println("Primero debes crear una liga.");
                        break;
                    }

                case 4: //Salir

                    salir = true;
                    break;
            }

        } while (salir == false);

    }
}

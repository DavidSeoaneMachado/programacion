import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Datos_ficheros datosficheros = new Datos_ficheros();

     /*   //Introducimos distintos platos en los ficheros de texto para que se puedan generar distintos menus//

        String[] entrantes = {"Pizza", "Calamares", "Gambas", "Langostinos", "Vieiras"} ;
        for (int i= 0; i< entrantes.length; i++){
            datosficheros.introducir_entrantes_fichero(entrantes[i],"entrantes.txt" );
        }
        String[] primeros = {"Solomillo", "Pechuga_pollo", "SAlmon", "Cocido", "Churrasco"} ;
        for (int i= 0; i< primeros.length; i++){
            datosficheros.introducir_primeros_fichero(primeros[i],"primeros.txt" );
        }
        String[] segundo = {"Pechuga_pavo", "Merluza", "Patatas_cocidas", "Carbonara", "Atun_con_pasta"} ;
        for (int i= 0; i< segundo.length; i++){
            datosficheros.introducir_segundos_fichero(segundo[i],"segundos.txt" );
        }
        String[] postre = {"Chocolate", "Yogurt", "Colacao", "Pera", "Manzana"} ;
        for (int i= 0; i< postre.length; i++){
            datosficheros.introducir_postres_fichero(postre[i],"postres.txt" );
        }*/


        boolean salir = false;
        boolean menu_creado = false;
        int contador = 1;

        Scanner rellenar = new Scanner(System.in);
        ArrayList<String> menu_actual = new ArrayList<>();
        Cocina cocina = new Cocina();


        do {
            System.out.println("Menú principal del restaurante Booleano. Que desea hacer?");
            System.out.println("\n1 Crear un menu. \n2 Visualizar el menu actual. \n3 Generar un nuevo menu. \n4 Consultas historico de menus. ");
            int menu = rellenar.nextInt();
            switch (menu) {
                case 1:
                    boolean submenu= false;
                    menu_actual = cocina.generador_de_menus();
                    menu_creado = true;
                    do {
                        System.out.println("Te gustaria guardalo o generar uno nuevo? \n1 Guardarlo \n2 Generar un nuevo menu");
                        int guardar_o_generar = 0;
                        guardar_o_generar = rellenar.nextInt();
                        switch (guardar_o_generar) {
                            case 1:
                                datosficheros.guardar_menu_fichero(menu_actual, contador);
                                contador = contador+1;
                                System.out.println("Se ha guardado tu menú en un fichero de texto");
                                submenu=true;
                                break;
                            case 2:
                                menu_actual = cocina.generador_de_menus();
                                break;
                        }
                } while (submenu==false);
                    break;
                case 2:
                    System.out.println("El menu actual generado es" + menu_actual);

                    break;
                case 3:
                    if (menu_creado == true) {
                        boolean submenu2= false;
                        System.out.println("Estas segur@? se borrará el menu ya generado. \n1 Si, estoy seguro \n2 No generar nuevo menu.");
                        int borrar_menu = 0;
                        borrar_menu = rellenar.nextInt();
                        if (borrar_menu == 1) {
                            do {
                                menu_actual = cocina.generador_de_menus();
                                System.out.println("Te gustaria guardalo o generar uno nuevo? \n1 Guardarlo \n2 Generar un nuevo menu");
                                int guardar_o_generar = 0;
                                guardar_o_generar = rellenar.nextInt();
                                switch (guardar_o_generar) {
                                    case 1:
                                        datosficheros.guardar_menu_fichero(menu_actual, contador);
                                        contador = contador+1;
                                        System.out.println("Se ha guardado tu menú en un fichero de texto");
                                        submenu2=true;
                                        break;
                                    case 2://no pongo nada porque debido al Do while se repite el bucle y ya crea un nuevo menu en la linea 76//
                                        break;
                                }
                            } while (submenu2==false);
                        }
                        if (borrar_menu == 2) {
                            System.out.println("No se borrará el menú");
                        }
                        if (borrar_menu != 2 && borrar_menu != 1) {
                            System.out.println("El numero introducido no concuerda con las opciones disponibles");
                        }
                    } else {
                        menu_actual = cocina.generador_de_menus();
                    }
                    break;
                case 4:
                    datosficheros.consulta_historico();
                    break;
            }

        } while (salir == false);
    }
}
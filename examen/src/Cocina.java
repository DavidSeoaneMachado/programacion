import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Cocina {

    public  ArrayList<String> generador_de_menus (){
        ArrayList<String> lista_todos_los_platos = new ArrayList<>();
        ArrayList<String> menu_generado_aleatorio = new ArrayList<>();
        FileReader lector;
        String[] ficheros = {"entrantes.txt", "primeros.txt", "segundos.txt", "postres.txt"} ;
        try {
            for (int i =0;i< ficheros.length;i++) {

                lector = new FileReader(ficheros[i]);
                BufferedReader br = new BufferedReader(lector);
                String linea;
                while ((linea = br.readLine()) != null) {
                    lista_todos_los_platos.add(linea);
                }
            }
            int aleatorio_entrantes = (int)Math.floor(Math.random()*(4-0+1)+0);
            int aleatorio_primeros = (int)Math.floor(Math.random()*(9-5+1)+5);
            int aleatorio_segundos = (int)Math.floor(Math.random()*(14-10+1)+10);
            int aleatorio_postres = (int)Math.floor(Math.random()*(19-15+1)+15);

            menu_generado_aleatorio.add(lista_todos_los_platos.get(aleatorio_entrantes));
            menu_generado_aleatorio.add(lista_todos_los_platos.get(aleatorio_primeros));
            menu_generado_aleatorio.add(lista_todos_los_platos.get(aleatorio_segundos));
            menu_generado_aleatorio.add(lista_todos_los_platos.get(aleatorio_postres));

            System.out.println("Tu menu esta compuesto por: \nEntrante-> "+ menu_generado_aleatorio.get(0) + "\nPrimero-> "+ menu_generado_aleatorio.get(1) + "\nSegundo-> "+ menu_generado_aleatorio.get(2) + "\nPostre-> "+ menu_generado_aleatorio.get(3) );

        }catch(IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }

        return menu_generado_aleatorio;


    }



}


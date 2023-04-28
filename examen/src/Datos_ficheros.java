import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Datos_ficheros {


    //METODOS PARA LA INTRODUCCION DE ELEMENTOS EN LOS FICHEROS////
    public void introducir_entrantes_fichero(String cadena, String fichero) {
        FileWriter escritura;
        try {
            escritura = new FileWriter(fichero, true);
            escritura.write(cadena + "\n");
            escritura.close();

        } catch (IOException e) {
            System.out.println(e.toString());

        }
    }

    public void introducir_primeros_fichero(String cadena, String fichero) {
        FileWriter escritura;
        try {
            escritura = new FileWriter(fichero, true);
            escritura.write(cadena + "\n");
            escritura.close();

        } catch (IOException e) {
            System.out.println(e.toString());

        }
    }

    public void introducir_segundos_fichero(String cadena, String fichero) {
        FileWriter escritura;
        try {
            escritura = new FileWriter(fichero, true);
            escritura.write(cadena + "\n");
            escritura.close();

        } catch (IOException e) {
            System.out.println(e.toString());

        }
    }

    public void introducir_postres_fichero(String cadena, String fichero) {
        FileWriter escritura;
        try {
            escritura = new FileWriter(fichero, true);
            escritura.write(cadena + "\n");
            escritura.close();

        } catch (IOException e) {
            System.out.println(e.toString());

        }
    }

    //FIN DE LA INTRODUCCION DE ELEMENTOS EN LOS FICHEROS DE PLATOS////


    //SECCION PARA GUARDAR MENUS/////////////

    public void guardar_menu_fichero(ArrayList<String> menu, int contador) {


        FileWriter escritura;
        try {
            escritura = new FileWriter("menu.txt", false);
            for (String dato : menu) {
                escritura.write(dato + "\n");
            }
            escritura.close();

        } catch (IOException e) {
            System.out.println(e.toString());
        }

        try {
            escritura = new FileWriter("menu_historico.txt", true);
            escritura.write(contador + "º menú historico:\n");
            for (String dato : menu) {
                escritura.write(dato + "\n");
            }
            contador = contador + 1;
            escritura.close();

        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }


    //CONSULTA DE MENUS HISTORICOS/////////////

    public void consulta_historico() {
        ArrayList<String> lista_historica = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("menu_historico.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                lista_historica.add(linea);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String linea : lista_historica) {
            // Hacer algo con cada cadena
            System.out.println(linea);
        }
    }
}


import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;

public class Ficheros {

    public void escritura(int entero, String fichero) {
        boolean exito = true;
        FileWriter escritura;
        try {
            escritura = new FileWriter(fichero, true);
            escritura.write(entero);
            escritura.close();
            exito = true;
        } catch (IOException e) {
            System.out.println(e.toString());
            exito = false;
        }
    }

    public int[][] lectura(String fichero ) {
        int[][] matriz_recoger_datos = new int[5][];
        ArrayList<Integer> array_enteros = new ArrayList<>();
        FileReader lector;
        try {
            lector = new FileReader(fichero);
            int cifra = lector.read();
            while (cifra != -1) {
                array_enteros.add(cifra);
                cifra = lector.read();
            }
            lector.close();
            int recorrer_arraylist = 0;
            for (int i = 0; i < matriz_recoger_datos.length; i++) {
                for (int j = 0; j < 1; j++) {
                    if (i % 2 ==0){
                        matriz_recoger_datos[i][j] = array_enteros.get(recorrer_arraylist);
                        matriz_recoger_datos[i][j+1]= array_enteros.get(recorrer_arraylist+1);
                        matriz_recoger_datos[i][j+2]= array_enteros.get(recorrer_arraylist+2);
                        recorrer_arraylist= recorrer_arraylist+3;
                    } else {
                        matriz_recoger_datos[i][j] = array_enteros.get(recorrer_arraylist);
                        matriz_recoger_datos[i][j+1]= array_enteros.get(recorrer_arraylist+1);
                        recorrer_arraylist= recorrer_arraylist+2;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return matriz_recoger_datos;
    }
}

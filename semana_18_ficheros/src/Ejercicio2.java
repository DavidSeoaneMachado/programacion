import java.io.*;
import java.util.ArrayList;

public class Ejercicio2 {

    public String metodo2 (String fichero){
        ArrayList<Character> arrayList = new ArrayList<>();
        String texto;
        FileReader lector;
        try {
            lector = new FileReader(fichero);
            int caracter = lector.read();
            while (caracter != -1) {
                char imprimir = (char) caracter;
                arrayList.add(imprimir);
                System.out.print(imprimir);
                caracter = lector.read();
            }
            lector.close();
        }catch(IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
       StringBuilder sb = new StringBuilder();
        for (Character c: arrayList) {
            sb.append(c);
        }
      texto= sb.toString();
        return texto;
    }

}

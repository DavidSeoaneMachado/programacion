import java.util.ArrayList;
import java.io.*;

public class Ejercicio7 {


    public void metodo7 (String fichero) {

        FileInputStream lecturaBytes;
        ObjectInputStream lecturaObjetos;
        Object objeto = null;

        try {
            lecturaBytes = new FileInputStream(fichero);
            lecturaObjetos = new ObjectInputStream(lecturaBytes);
            objeto = lecturaObjetos.readObject();
            System.out.println(objeto.toString());
            lecturaObjetos.close();
            lecturaBytes.close();
            System.out.println("Exito");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Debacle");
        }
    }
}

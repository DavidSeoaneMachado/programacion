import java.io.*;
public class Ejercicio5 {

    public Object metodo5 (String fichero){

        FileInputStream lecturaBytes;
        ObjectInputStream lecturaObjetos;
        Object objeto = null;

        try {
            lecturaBytes = new FileInputStream(fichero);
            lecturaObjetos = new ObjectInputStream(lecturaBytes);
            objeto = (Object) lecturaObjetos.readObject();
            System.out.println(objeto.toString());
            lecturaObjetos.close();
            lecturaBytes.close();
            System.out.println("Exito");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Debacle");
        }
        return objeto;
    }
}

import java.io.*;

public class Ejercicio4 {

    public void metodo4 (Object objeto, String ruta, boolean agregar_o_sobrescribir){

        FileOutputStream escrituraBytes;
        ObjectOutputStream escrituraObjetos;
        BufferedWriter buffer;

        try {
            escrituraBytes = new FileOutputStream("fichero1.txt");
            escrituraObjetos = new ObjectOutputStream(escrituraBytes);
            escrituraObjetos.writeObject(objeto);
            escrituraObjetos.close();
            escrituraBytes.close();
            System.out.println("Exito");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Debacle");
        }
    }
}

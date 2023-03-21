import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ejercicio6 {

    public String metodo6(ArrayList lista, String fichero, boolean agregar_sobrescribir) {

        FileOutputStream escrituraBytes;
        ObjectOutputStream escrituraObjetos;
        BufferedWriter buffer;
        String mensaje ="";

        if (agregar_sobrescribir == true) {
            try {
                escrituraBytes = new FileOutputStream("fichero1.txt", true);
                escrituraObjetos = new ObjectOutputStream(escrituraBytes);
                escrituraObjetos.writeObject(lista);
                escrituraObjetos.close();
                escrituraBytes.close();
                System.out.println("Exito");
                mensaje = "Agregado";
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Debacle");
            }
        } else {
                try {
                    escrituraBytes = new FileOutputStream(fichero, false);
                    escrituraObjetos = new ObjectOutputStream(escrituraBytes);
                    escrituraObjetos.writeObject(lista);
                    escrituraObjetos.close();
                    escrituraBytes.close();
                    System.out.println("Exito");
                    mensaje = "Sobrescrito";
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Debacle");
                }
            }
            return mensaje;
        }
    }



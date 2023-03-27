import java.io.*;
public class Escribir_ficheros {

    public void escritura (String cadena, String fichero) {
        boolean exito = true;
        FileWriter escritura;
        try {
            escritura = new FileWriter(fichero);
            escritura.write(cadena);
            escritura.close();
            exito = true;
        } catch (IOException e) {
            System.out.println(e.toString());
            exito = false;
        }
    }
}

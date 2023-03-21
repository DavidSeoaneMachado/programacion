import java.io.*;

public class Ejercicio1 {

    public boolean metodo (String cadena, String fichero1) {
        boolean exito;
        FileWriter escritura;
        try {
            escritura = new FileWriter(fichero1);
            escritura.write(cadena);
            escritura.close();
            exito = true;
            System.out.println("Exitazo");
        } catch (IOException e) {
            System.out.println(e.toString());
            exito = false;
            System.out.println("Debacle");
        }
        return exito;
    }

}

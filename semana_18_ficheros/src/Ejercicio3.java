import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {

    public boolean metodo3 (String cadena, String fichero, boolean agregar_o_sobrescribir){ //true agregaria y false sobrescribe lo que haya desde el principio//

        if (agregar_o_sobrescribir==true){
            boolean exito;
            FileWriter escritura;
            try {
                escritura = new FileWriter(fichero, true);
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

        } else {
            boolean exito;
            FileWriter escritura;
            try {
                escritura = new FileWriter(fichero, false);
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
}

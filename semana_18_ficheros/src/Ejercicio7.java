import java.io.*;
import java.util.ArrayList;

public class Ejercicio7 {

    public ArrayList metodo7(String fichero) {

        //He probado de distintas maneras pero solo me lee el primer conjunto de objetos introducido, no todos los que hay.
        //Tambien me ha salido el error "invalid type code: AC"//
        //Debajo esta comentado mi codigo inicial//

        //FileInputStream lecturaBytes;
        //ObjectInputStream lecturaObjetos;
        Object objeto = null;
        ArrayList<Object> objetos = new ArrayList<>();

        File file = new File(fichero);

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (fis.available() > 0) {
                Object obj = ois.readObject();
                objetos.add(obj);
            }
            ois.close();
            fis.close();

            // Ahora puedes acceder a los objetos almacenados en la lista:
            for (Object obj : objetos) {
                System.out.println(obj.toString());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objetos;

         /*  try {
            lecturaBytes = new FileInputStream(fichero);
            lecturaObjetos = new ObjectInputStream(lecturaBytes);
           while ((objeto = lecturaObjetos.readObject()) != null) {
               System.out.println(objeto.toString());
               array_para_retorno.add(objeto);
           }
            lecturaObjetos.close();
            lecturaBytes.close();
            System.out.println("Exito");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Debacle");
        }
        return array_para_retorno;  */
    }
}

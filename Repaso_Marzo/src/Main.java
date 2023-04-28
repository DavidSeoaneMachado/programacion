public class Main {
    public static void main(String[] args) {


        Ficheros fichero = new Ficheros();
      /*  fichero.escritura(10, "fichero_datos.txt");
        fichero.escritura(8, "fichero_datos.txt");
        fichero.escritura(2, "fichero_datos.txt"); */


        int[][] matriz_auxiliar = fichero.lectura("fichero_datos.txt");

        Orquesta orquesta = new Orquesta();

        System.out.println( orquesta.ejecutar_movimiento(matriz_auxiliar));

    }
}

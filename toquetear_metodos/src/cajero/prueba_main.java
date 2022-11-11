package cajero;

public class prueba_main {

    private static int opcion; //Atributo que solo se puede usar en esta clase//

    public static void main(String[] args) {

        prueba_clase_cajero.mostrarMenu();
        opcion = prueba_clase_cajero.introducirOpcion();
        if (opcion==1){
            prueba_clase_cajero.preguntarCantidad();
        }
    }

    public static void exit(){


    }
}

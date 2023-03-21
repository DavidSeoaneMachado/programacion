import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Ejercicio1 ej1 = new Ejercicio1();
        // ej1.metodo("Quien es el mensajero de DIOs", "fichero1.txt");

        Ejercicio2 ej2 = new Ejercicio2();
        //ej2.metodo2("fichero1.txt");

        Ejercicio3 ej3 = new Ejercicio3();
        // ej3.metodo3("Yo soy Antonio Manrrriquez, has matado a mi tio segundo, preparate a morir", "fichero1.txt" , true);

        Ejercicio4 ej4 = new Ejercicio4();
        clase_objeto4 objeto4 = new clase_objeto4(33, 44, "Ramon");
        //  ej4.metodo4(objeto4, "fichero1.txt", true);

        Ejercicio5 ej5 = new Ejercicio5();
        //ej5.metodo5("fichero1.txt");

        Ejercicio6 ej6 = new Ejercicio6();
        clase_objeto4 objeto6 = new clase_objeto4(5678, 23, "Remiro");
        clase_objeto4 objeto6_7 = new clase_objeto4(2, 89, "Clotilde");
        ArrayList<Object> lista_objetos = new ArrayList<>();
        lista_objetos.add(objeto4);
        lista_objetos.add(objeto6);
        lista_objetos.add(objeto6_7);
       // ej6.metodo6(lista_objetos, "fichero1.txt", false);

        Ejercicio7 ej7 = new Ejercicio7();
        ej7.metodo7("fichero1.txt");

    }
}

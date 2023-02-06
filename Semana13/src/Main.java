import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Jugador jugador = new Jugador(1000, 15, 15, "Conde Felipe Dominguez Alaurín", 3, 5);
        Entidad enemigo = new Enemigo(2000, 20, 3, "Magistrado Eduardo Lopez De los Palacios Minguez", 3);

        Entidad arrayEntidad[] = new Entidad[2];

        arrayEntidad[0] = jugador;
        arrayEntidad[1] = enemigo;
        boolean salir = false;
        Scanner cubrir = new Scanner(System.in);

        System.out.println("Comienza el combate entre " + arrayEntidad[0].getNombre() +" y "+ arrayEntidad[1].getNombre());

        while (!salir) {
            int accion = 0;
            int daño = 0;
            for (int i = 0; i < arrayEntidad.length; i++) {
                accion = (int) (Math.random() * (3 - 1 + 1) + 1);
                arrayEntidad[i].turno(accion);

                if (accion == 1) {
                    daño = arrayEntidad[i].turno(accion);
                    System.out.println(arrayEntidad[i].getNombre() + " ha hecho un ataque nivel 1 provocando " + daño + " puntos de daño.");
                } else if (accion == 2) {
                    daño = arrayEntidad[i].turno(accion);
                    System.out.println(arrayEntidad[i].getNombre() + " ha hecho un ataque nivel 2 provocando " + daño + " puntos de daño.");
                }else if (accion == 3) { //opcion para recuperar vida//
                    arrayEntidad[i].setVida(arrayEntidad[i].getVida()+40);
                    System.out.println(arrayEntidad[i].getNombre() + " ha usado cura y le ha robado a sus campesinos 40 de vida en tributos." );
                }
                if (arrayEntidad[i].getNombre().equals(jugador.getNombre()) && jugador.getVida()>=0) {
                    enemigo.setVida(enemigo.getVida()-daño);
                    if (enemigo.getVida() <= 0 ){
                        System.out.println("Gana " + jugador.getNombre());
                        salir= true;
                    }
                }
                if (arrayEntidad[i].getNombre().equals(enemigo.getNombre()) && enemigo.getVida()>=0){
                    jugador.setVida(jugador.getVida()-daño);
                    if (jugador.getVida() <= 0 ){
                        System.out.println("Gana " + enemigo.getNombre());
                        salir= true;
                    }
                }
                System.out.println("-La vida actual de "+ jugador.getNombre() + " es " + jugador.getVida());
                System.out.println("-La vida actual de "+ enemigo.getNombre() + " es " + enemigo.getVida());
            }
        }    // No funciona perfectamente. A la hora de acabar el programa da fallos relacionados con la colocacion de los elementos, pero como no es lo importante del ejercicio queda así.
    }
}

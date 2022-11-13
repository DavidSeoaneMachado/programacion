package semana8;

public class ejercicio2 {

    public static void Azar (int max, int min) {

        int aleatorio = (int)Math.floor(Math.random()*(max-min+1)+min);  // formula para generar valores entre los max y min que le damos
        System.out.println(aleatorio);

    }
}

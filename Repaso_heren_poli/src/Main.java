public class Main {

    public static void main(String[] args) {

        Espada espada = new Espada(10, 3, 5, 3);
        Lanza lanza = new Lanza(13, 3, 8, 4);
        Hacha hacha = new Hacha(15, 3, 3, 2);
        Botas botas = new Botas(3, 3);
        Casco casco = new Casco(5, 4);

        Equipo[] arraydeCosas = new Equipo[5];
        arraydeCosas[0] = espada;
        arraydeCosas[1] = lanza;
        arraydeCosas[2] = hacha;
        arraydeCosas[3] = botas;
        arraydeCosas[4] = casco;

        int aleatorio = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);

        for (Equipo elemento : arraydeCosas) {
            if (elemento instanceof Arma) {
                ((Arma) elemento).doing_damage(aleatorio);
            } else {
                if (elemento instanceof Botas) {
                    ((Botas) elemento).acción_especial(true, 5);
                }
                if (elemento instanceof Casco) {
                    ((Casco) elemento).acción_especial(false);
                }
            }
        }
    }
}

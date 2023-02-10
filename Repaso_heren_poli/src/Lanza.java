public class Lanza extends Arma {

    public Lanza() {
    }

    public Lanza(double damage, double multiplicador, double distancia, double tiempo_para_damage) {
        super(damage, multiplicador, distancia, tiempo_para_damage);
    }

    public Lanza(int nivel_rareza, int nivel, String nombre, double damage, double multiplicador, double distancia, double tiempo_para_damage) {
        super(nivel_rareza, nivel, nombre, damage, multiplicador, distancia, tiempo_para_damage);
    }

    @Override
    public double doing_damage(double distancia_enemigo) {
        if (distancia_enemigo <= getDistancia()){
            if (distancia_enemigo >= (getDistancia()/2)) {
                return getMultiplicador() * getDamage();
            }
            return 0.0;
        }
        return 0.0;
    }
}

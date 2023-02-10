public class Arma extends Equipo{

    private double damage; //Daño propio de un arma
    private double multiplicador; // Multiplicador de daño (por si se necesita)
    private double distancia; // Distancia a la que el arma puede hacer daño

    private double tiempo_para_damage; // Cada cuanto hace daño el arma

    Arma(){}

    public Arma(double damage, double multiplicador, double distancia,double tiempo_para_damage) {
        this.damage = damage;
        this.multiplicador = multiplicador;
        this.distancia = distancia;
        this.tiempo_para_damage = tiempo_para_damage;
    }

    public Arma(int nivel_rareza, int nivel, String nombre, double damage, double multiplicador, double distancia, double tiempo_para_damage) {
        super(nivel_rareza, nivel,nombre);
        this.damage = damage;
        this.multiplicador = multiplicador;
        this.distancia = distancia;
        this.tiempo_para_damage = tiempo_para_damage;
    }

    /**
     * Método utilizado para dañar a los enemigos
     * @param distancia_enemigo
     * @return
     */
    public double doing_damage(double distancia_enemigo){
        if(distancia_enemigo<=this.distancia){
            return multiplicador * damage;
        }
        return 0.0;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTiempo_para_damage() {
        return tiempo_para_damage;
    }

    public void setTiempo_para_damage(double tiempo_para_damage) {
        this.tiempo_para_damage = tiempo_para_damage;
    }
}
public class Botas extends Armadura {
    public Botas() {
    }

    public Botas(double defensa, double multiplicador) {
        super(defensa, multiplicador);
    }

    public Botas(int nivel_rareza, int nivel, String nombre, double defensa, double multiplicador) {
        super(nivel_rareza, nivel, nombre, defensa, multiplicador);
    }

    public double acción_especial(boolean melee, int distancia){
        return getDefensa() + getMultiplicador();
    }
}

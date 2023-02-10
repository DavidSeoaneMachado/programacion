public class Casco extends Armadura {

    public Casco() {
    }

    public Casco(double defensa, double multiplicador) {
        super(defensa, multiplicador);
    }

    public Casco(int nivel_rareza, int nivel, String nombre, double defensa, double multiplicador) {
        super(nivel_rareza, nivel, nombre, defensa, multiplicador);
    }

    public double acción_especial(boolean proyectil){
        return getDefensa() + getMultiplicador();
    }
}

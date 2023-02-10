public class Armadura extends Equipo{

    private double defensa; //Daño que evita

    private double multiplicador; // Multiplicador defensivo (por si se necesita)

    public Armadura(){}

    public Armadura(double defensa, double multiplicador) {
        this.defensa = defensa;
        this.multiplicador = multiplicador;
    }

    public Armadura(int nivel_rareza, int nivel, String nombre, double defensa, double multiplicador) {
        super(nivel_rareza, nivel, nombre);
        this.defensa = defensa;
        this.multiplicador = multiplicador;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }
}
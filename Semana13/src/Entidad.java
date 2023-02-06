public class Entidad {

    private int vida = 0;
    private int ataque = 0;



    private int defensa = 0;
    private String nombre = "";
    public Entidad() {
    }

    public Entidad(int vida, int ataque, int defensa, String nombre) {
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int turno(int accion){



        return accion;
    }

    public void info (){

    }
}

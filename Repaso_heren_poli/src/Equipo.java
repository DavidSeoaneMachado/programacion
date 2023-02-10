/**
 * Clase padre, contendra los métodos y atributos comunes
 */
public class Equipo {
    /*
    Los enumeradores son una clase especial de variables que almacenan múltiples valores y permite seleccionar
    entre uno de los valores. Podríamos decir que es un array de constantes.
     */
    private enum Rareza {FRECUENTE,INFRECUENTE,RARO,MITICO,LEGENDARIO}
    private Rareza nivel_rareza;
    private int nivel;

    private String nombre; // El nombre del equipamiento (MISC)

    Equipo(){}

    public Equipo(int nivel_rareza, int nivel, String nombre) {
        this.nivel_rareza = asignar_rareza(nivel_rareza);
        this.nivel = nivel;
        this.nombre = nombre;
    }

    /**
     * Método privado para simplemente asignar una rareza dependiendo del nivel
     * @param rareza
     * @return
     */
    private Rareza asignar_rareza(int rareza){
        switch(rareza){
            case 0:
                return Rareza.FRECUENTE;
            case 1:
                return Rareza.INFRECUENTE;
            case 2:
                return Rareza.RARO;
            case 3:
                return Rareza.MITICO;
            case 4:
                return Rareza.LEGENDARIO;
            default:
                return Rareza.FRECUENTE;
        }
    }

    /**
     * Método privado para llamar a una accion especial
     * @param
     * @return
     */
    public void acción_especial(){

    }

    public Rareza getNivel_rareza() {
        return nivel_rareza;
    }

    public void setNivel_rareza(Rareza nivel_rareza) {
        this.nivel_rareza = nivel_rareza;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
public class Equipo_futbol extends Equipo {
    @Override
    public String toString() {
        return getNombre();
    }
    public Equipo_futbol(String nombre) {
        super(nombre);
    }
}

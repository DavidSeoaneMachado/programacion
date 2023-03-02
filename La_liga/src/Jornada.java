public class Jornada {

    private Equipo local;
    private Equipo vistante;

    public Jornada(Equipo_futbol local, Equipo_futbol visitante){
        this.local = local;
        this.vistante = visitante;
    }

    @Override
    public String toString() {
        return local + " contra " + vistante ;
    }
}

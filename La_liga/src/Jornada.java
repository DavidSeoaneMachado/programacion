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

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVistante() {
        return vistante;
    }

    public void setVistante(Equipo vistante) {
        this.vistante = vistante;
    }
}


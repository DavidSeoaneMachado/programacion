public abstract class Equipo {
   private int partidos_jugados;
    private  int goles_a_favor;
    private  int goles_en_contra;
    private  int victorias;
    private  int derrotas;
    private   int empates;
    private  int puntuacion;
    private  String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidos_jugados() {
        return partidos_jugados;
    }

    public void setPartidos_jugados(int partidos_jugados) {
        this.partidos_jugados = partidos_jugados;
    }

    public int getGoles_a_favor() {
        return goles_a_favor;
    }

    public void setGoles_a_favor(int goles_a_favor) {
        this.goles_a_favor = goles_a_favor;
    }

    public int getGoles_en_contra() {
        return goles_en_contra;
    }

    public void setGoles_en_contra(int goles_en_contra) {
        this.goles_en_contra = goles_en_contra;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}

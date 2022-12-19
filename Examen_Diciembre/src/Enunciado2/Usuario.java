package Enunciado2;

public class Usuario {

    private int victorias = 0;
    private int derrotas = 0;
    private int empates = 0; //entiendo que es imposible que haya empates ya que es un juego en el que siempre gana uno u otro y en cuanto uno llega a 5 se acaba.
    private int partidas_jugadas = 0;

    Usuario(){
        int victorias = 0;
        int derrotas = 0;
        int empates = 0;
        int partidas_jugadas = 0;
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

    public int getPartidas_jugadas() {
        return partidas_jugadas;
    }

    public void setPartidas_jugadas(int partidas_jugadas) {
        this.partidas_jugadas = partidas_jugadas;
    }


}

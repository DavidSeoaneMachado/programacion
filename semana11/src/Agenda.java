import java.util.Arrays;

public class Agenda {

    private Perfil[] agenda;

    public Agenda(int numeroResgistros) {
        this.agenda = new Perfil[numeroResgistros];
    }

    @Override
    public String toString() {
        return "La agenda consta de: " +
                Arrays.toString(agenda) +
                '}';
    }

    public void añadirPerfiles(Perfil objeto) {
        for (int i = 0; i < this.agenda.length; i++) {
            try {
                if (this.agenda[i] == null) {
                    this.agenda[i] = objeto;
                }
            } catch (ArrayIndexOutOfBoundsException excepcion){
                System.out.println("Ya has cubierto todos los huecos de la agenda.");
            }

        }

    }

}


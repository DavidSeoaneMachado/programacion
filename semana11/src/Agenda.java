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

    public void añadirPerfiles(Perfil objeto, int iteracion) {
        for (int i = 0; i < this.agenda.length; i++) {
            try {
                if (i == iteracion) {
                    this.agenda[i] = objeto;
                }
            } catch (ArrayIndexOutOfBoundsException excepcion) {
                System.out.println("Ya has cubierto todos los huecos de la agenda.");
            }

        }

    }
    //Primer metodo para añadir perfiles que daba como resultado que los datos iniciales pedidos ocuparan todos los puestos//
   /* public void añadirPerfiles(Perfil objeto, int interacion) {
        for (int i = 0; i < this.agenda.length; i++) {
            try {
                if (this.agenda[i] == null) {
                    this.agenda[i] = objeto;
                }
            } catch (ArrayIndexOutOfBoundsException excepcion) {
                System.out.println("Ya has cubierto todos los huecos de la agenda.");
            }

        }

    } */

}


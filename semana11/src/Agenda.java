import java.util.Arrays;

public class Agenda {

       private Perfil[] agenda;

       public Agenda(int numeroResgistros){
           this.agenda = new Perfil[numeroResgistros];
       }

    @Override
    public String toString() {
        return "Agenda{" +
                "agenda=" + Arrays.toString(agenda) +
                '}';
    }
}
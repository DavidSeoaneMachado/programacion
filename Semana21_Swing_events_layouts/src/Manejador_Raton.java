import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Manejador_Raton implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Se levanta el botón del ratón dentro del componente, tras pulsarlo");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Se presiona el botón del ratón mientras está en el componente");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Se levanta el botón del ratón fuera del componente, tras pulsarlo");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("El ratón entra en entorno del componente");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("El ratón sale del entorno del componente");
    }
}

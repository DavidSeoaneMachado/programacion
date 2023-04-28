import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridLayoutDemo extends JFrame {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setBounds(0, 0, 1300, 800);
        ventana.setTitle("Probando Swing");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();

        panel1.setBackground(Color.RED);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.YELLOW);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.GREEN);

        JPanel panelPrincipal = new JPanel(new GridLayout(2, 2));
        panelPrincipal.add(panel1);
        panelPrincipal.add(panel2);
        panelPrincipal.add(panel3);
        panelPrincipal.add(panel4);

        ventana.add(panel1);
        ventana.add(panel2);
        ventana.add(panel3);
        ventana.add(panel4);

        ventana.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setBounds(0,0,300,400);
        ventana.setTitle("Probando Swing");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Button boton = new Button();
        boton.setLabel("Pulsador");
        boton.setBounds(100,150,100,50);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("El boton funciona");
            }
        });
//Eliminamos el layout por defecto
        ventana.setLayout(null);
//Agregamos los elementos a la ventana
        ventana.add(boton);
        JCheckBox checkbox = new JCheckBox("Probando");
        checkbox.setBounds(10,10,100,100);
//Eliminamos el layout por defecto
        ventana.setLayout(null);
//Agregamos los elementos a la ventana
        ventana.add(checkbox);

        ButtonGroup grupo_de_botones = new ButtonGroup();
        JRadioButton boton_1 = new JRadioButton("Prueba_1");
        boton_1.setBounds(210,20,100,50);
        JRadioButton boton_2 = new JRadioButton("Prueba_2");
        boton_2.setBounds(210,50,100,50);
        grupo_de_botones.add(boton_1);
        grupo_de_botones.add(boton_2);
//Eliminamos el layout por defecto
        ventana.setLayout(null);
//Agregamos los elementos a la ventana
        ventana.add(boton_1);
        ventana.add(boton_2);




        ventana.setVisible(true);
    }
}
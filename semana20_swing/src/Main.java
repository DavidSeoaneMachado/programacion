import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;


public class Main {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setBounds(0, 0, 1600, 900);
        ventana.setTitle("Probando Swing");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Etiqueta superior//
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Probando la libreria Swing en Java");
        etiqueta.setBounds(650, 10, 1600, 50);

        //Menu//
        JMenuBar menu = new JMenuBar();
        menu.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        menu.setBounds(0, 50, 1585, 30);
        JMenu archivo = new JMenu();
        archivo.setText("Archivo");
        archivo.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        JMenu acciones = new JMenu();
        acciones.setText("Acciones");
        acciones.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        JMenu ayuda = new JMenu();
        ayuda.setText("Ayuda");
        ayuda.setBorder(BorderFactory.createLineBorder(Color.black, 1, true));

        //Botones//
        JButton boton = new JButton();
        boton.setLabel("Nueva liga");
        boton.setBounds(100, 150, 150, 50);
        boton.setBackground(Color.lightGray);
        boton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        JButton boton2 = new JButton();
        boton2.setLabel("Jugar liga");
        boton2.setBounds(100, 250, 150, 50);
        boton2.setBackground(Color.lightGray);
        boton2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        JButton boton3 = new JButton();
        boton3.setLabel("Siguiente jornada");
        boton3.setBounds(100, 350, 150, 50);
        boton3.setBackground(Color.lightGray);
        boton3.setEnabled(false);
        boton3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        JButton boton4 = new JButton();
        boton4.setLabel("Simulación completa");
        boton4.setBounds(100, 450, 150, 50);
        boton4.setBackground(Color.lightGray);
        boton4.setEnabled(false);
        boton4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        JButton boton5 = new JButton();
        boton5.setLabel("Salir");
        boton5.setBounds(100, 620, 150, 50);
        boton5.setBackground(Color.lightGray);
        boton5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));


        //Tabla//
        String[] columnNames = {"Posicion",
                "Nombre",
                "Victorias",
                "Empates",
                "Derrotas",
                "Puntuacion"};

        Object[][] data = {
                {"1º", "Madrí",
                        "4", 2, 1, 32},
                {"2º", "Barsalona",
                        "3", 3, 1, 30},
                {"3º", "Beti",
                        "2", 3, 1, 29},
                {"4º", "Selta",
                        "1", 3, 2, 27}

        };


        JPanel panel = new JPanel();
        JScrollPane scrollPane = new JScrollPane();
        panel.add(scrollPane);
        JTable tabla = new JTable(data, columnNames);
        scrollPane.add(tabla);
        JTableHeader cabecera = tabla.getTableHeader();
        tabla.setBounds(350, 200, 1150, 350);
        tabla.setTableHeader(cabecera);
        cabecera.setBounds(350, 150, 1150, 50);




      //Centrar los elementos de las celdas//
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }




        //Eliminamos el layout por defecto
        ventana.setLayout(null);
        //Agregamos los elementos a la ventana
        ventana.add(etiqueta);
        ventana.add(menu);
        ventana.add(archivo);
        ventana.add(acciones);
        ventana.add(ayuda);
        ventana.add(boton);
        ventana.add(boton2);
        ventana.add(boton3);
        ventana.add(boton4);
        ventana.add(boton5);
        ventana.add(tabla);
        ventana.add(cabecera);



        menu.add(archivo);
        menu.add(acciones);
        menu.add(ayuda);


        ventana.setVisible(true);

    }

}

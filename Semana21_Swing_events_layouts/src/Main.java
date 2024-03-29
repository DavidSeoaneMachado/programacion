import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;


public class Main {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setBounds(0, 0, 1500, 800);
        ventana.setTitle("Probando Swing");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        //Creamos el layout//
        GridLayout grid = new GridLayout(3, 0);
        grid.setHgap(30);
        grid.setVgap(10);
        ventana.setLayout(grid);

        //Creamos los distintos paneles que va a contener la ventana//
        JPanel header = new JPanel();
        header.setLayout(new GridLayout(5, 0));
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(5, 0));
        //panel1.setLayout(new FlowLayout(0, 200, 100));
        panel1.setBackground(Color.lightGray);
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2, 0));

        //Etiqueta superior//
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Probando la libreria Swing en Java");
        header.add(etiqueta);
        etiqueta.setHorizontalAlignment(JLabel.CENTER);


        //Menu//
        JMenuBar menu = new JMenuBar();
        menu.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        header.add(menu);
        JMenu archivo = new JMenu();
        archivo.setText("Archivo");
        archivo.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        JMenuItem nuevo = new JMenuItem("Nuevo");
        archivo.add(nuevo);
        JMenu acciones = new JMenu("Acciones");
        acciones.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        JMenu ayuda = new JMenu("Ayuda");
        ayuda.setBorder(BorderFactory.createLineBorder(Color.black, 1, true));
        JMenuItem version = new JMenuItem("Version");
        ayuda.add(version);
        //Funcionalidad: al pasar por encima el boton informa de lo que hace en cuadro de dialogo//
        version.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Estas trabajando con la version 8.6");
            }
        });
        JMenuItem acerca_de = new JMenuItem("Acerca de");
        ayuda.add(acerca_de);
        //Funcionalidad: al pasar por encima el boton informa de lo que hace en cuadro de dialogo//
        acerca_de.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Programa para simulacion de ligas");
            }
        });

        //Botones//
        JButton boton = new JButton();
        boton.setLabel("Nueva liga");
        boton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        //Funcionalidad: el boton informa de que se crea una nueva liga//
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se esta creando la Liga");
            }
        });

        JButton boton2 = new JButton();
        boton2.setLabel("Jugar liga");
        boton2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        //Funcionalidad: al pasar por encima el boton informa por consola de lo que hace//
        boton2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                System.out.println("Al hacer click se simulará la liga por completo");
            }
        });

        JButton boton3 = new JButton();
        boton3.setLabel("Siguiente jornada");
        //boton3.setEnabled(false);
        boton3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        //Funcionalidad: al hacer click informa por ventana de lo que hace//
        ClickBoton clickBoton = new ClickBoton();
        boton3.addActionListener(clickBoton);


        JButton boton4 = new JButton();
        boton4.setLabel("Simulación completa");
        boton4.setEnabled(false);
        boton4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        JButton boton5 = new JButton();
        boton5.setLabel("Salir");
        boton5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        //Funcionalidad: el boton de Salir cierra la ventana//
        SalirListener salir = new SalirListener();
        boton5.addActionListener(salir);

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


        JTable tabla = new JTable(data, columnNames);
        JTableHeader cabecera = tabla.getTableHeader();
        panel2.add(cabecera);
        panel2.add(tabla);


        //Centrar los elementos de las celdas//
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }


        //Agregamos los elementos a la ventana
        panel1.add(boton);
        panel1.add(boton2);
        panel1.add(boton3);
        panel1.add(boton4);
        panel1.add(boton5);

        ventana.add(header );
        ventana.add(panel1);
        ventana.add(panel2);


        menu.add(archivo);
        menu.add(acciones);
        menu.add(ayuda);

        //ventana.pack();
        //ventana.setResizable(false);
        ventana.setVisible(true);

    }

}

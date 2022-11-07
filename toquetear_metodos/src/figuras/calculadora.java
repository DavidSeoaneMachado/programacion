package figuras;

import java.util.Scanner;

public class calculadora {

    int base = 0;
    int altura = 0;
    int perimetro = 0;
    int apotema = 0;
    String tri = "triangulo";
    String rec = "rectangulo";
    String pen = "pentagono";
    String hex = "hexagono";
    String figura;


    public void leerFigura(String figu) {

        if (figu.equals(tri)) {
            System.out.println("Introduce la base y la altura");
            figura = "triangulo";

        } else if (figu.equals(rec)) {
            System.out.println("Introduce la base y la altura");
            figura = "rectangulo";

        } else if (figu.equals(pen)) {
            System.out.println("Introduce el perimetro y la apotema");
            figura = "pentagono";

        } else if (figu.equals(hex)) {
            System.out.println("Introduce el perimetro y la apotema");
            figura = "hexagono";

        } }


        public void leerDatos (){
            int operacion = 0;
            String figura3 = figura;
            switch (operacion){

        }




        }
    }


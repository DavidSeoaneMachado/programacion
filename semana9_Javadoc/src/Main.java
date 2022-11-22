/**
 * Semana 9 (main).
 *
 * @author David Seoane Machado
 * @version 22.11.2022
 *
 */

public class Main {

    public static void main(String[] args) {

        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        Perro perro3 = new Perro();

        perro1.setPelo("Liso");
        perro1.setColor("Verde");
        perro1.setChip(9999);
        perro1.setPeso(20);
        perro1.setAltura(140);

        perro2.setPelo("Liso");
        perro2.setColor("Verde");
        perro2.setChip(8989999);
        perro2.setPeso(1);
        perro2.setAltura(1);

        perro3.setPelo("Liso");
        perro3.setColor("Verde");
        perro3.setChip(89849);
        perro3.setPeso(10);
        perro3.setAltura(1);

        Perro[] Perros = new Perro[3];
        Perros[0] = perro1;
        Perros[1] = perro2;
        Perros[2] = perro3;


        for (int i = 0; i < Perros.length; i++) {
            System.out.println("El ladrido del " + (i + 1) + "º perro con " + Perros[i].getPeso() + " kg de peso y "
                    + Perros[i].getAltura() + " cm de altura es: " + Perro.ladrar(Perros[i].getPeso(), Perros[i].getAltura()));
        }

    }
}


package semana9.ejercicio;

public class main {

    public static void main(String[] args) {

        perro perro1 = new perro();
        perro perro2 = new perro();
        perro perro3 = new perro();

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

        perro[] perros = new perro[3];
        perros[0] = perro1;
        perros[1] = perro2;
        perros[2] = perro3;


        for (int i = 0; i < perros.length; i++) {
            System.out.println("El ladrido del " + (i + 1) + "º perro con " + perros[i].getPeso() + " kg de peso y "
                    + perros[i].getAltura() + " cm de altura es: " + perro.ladrar(perros[i].getPeso(), perros[i].getAltura()));
        }

    }
}


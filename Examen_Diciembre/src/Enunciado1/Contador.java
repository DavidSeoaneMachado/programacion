package Enunciado1;

public class Contador {

    private int contador_total = 0;

    public void operaciones_rotas(int valor) {

        int aleat = (int) Math.floor(Math.random() * (4 - 1 + 1) + 1);

        switch (aleat) {

            case 1:
                contador_total = contador_total + valor + valor;
                System.out.println("El total acumulado en el contador hasta ahora es " + contador_total);
                break;
            case 2:
                contador_total = contador_total - (valor / 2);
                System.out.println("El total acumulado en el contador hasta ahora es " + contador_total);
                break;
            case 3:
                contador_total = contador_total * valor;
                System.out.println("El total acumulado en el contador hasta ahora es " + contador_total);
                break;
            case 4:
                System.out.println("El total acumulado en el contador hasta ahora es " + contador_total);
                break;

        }

    }


}

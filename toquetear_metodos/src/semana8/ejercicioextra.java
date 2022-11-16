package semana8;
import  java.util.Arrays;

//Enunciado: dado un array con valores aleatorios (10 valores), ordenar estos valores d emenor a mayor//

public class ejercicioextra {

    public static void main(String[] args) {

        int [] array = new int[10];

        for (int i=0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(i);
            }

        Arrays.sort(array);
        for (int j: array) {
            System.out.println(j);
        }
    }
}


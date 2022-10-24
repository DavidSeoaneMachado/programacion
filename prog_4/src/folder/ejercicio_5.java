package folder;
import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("Escribe una frase ");
        String frase = cubrir.nextLine();

        if (frase.contains("b")) {
            System.out.println("Esta frase contiene una 'b'");
            String frase_1 = frase.contains("p") ? "Ademas contiene la letra 'p'" : "Pero no contiene la letra 'p'";
            System.out.println(frase_1);

        } else {
            System.out.println("Esta frase no contiene 'b'");
        }

        if (frase.contains("v")) {
            System.out.println("Esta frase contiene una 'v'");
            String frase_2 = frase.contains("u") ? "Ademas contiene la letra 'u'" : "Pero no contiene la letra 'u'";
            System.out.println(frase_2);

        } else {
            System.out.println("Esta frase no contiene 'v'");
        }
    }
}


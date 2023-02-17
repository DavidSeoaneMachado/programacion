public class Main {
    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado(5);

        Rectangulo rectangulo = new Rectangulo(8, 5);

        Triangulo triangulo = new Triangulo(5, 8);

        Forma[] formas = new Forma[3];

        formas[0] = cuadrado;
        formas[1] = rectangulo;
        formas[2] = triangulo;

        for (Forma f : formas) {
            f.dibujar_puntos();
            f.rellenar_forma();
            f.calcular_area();
            f.calcular_perimetro();
        }

    }
}

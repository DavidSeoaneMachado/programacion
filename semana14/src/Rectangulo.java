public class Rectangulo extends Cuadrilatero implements Forma {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar_puntos() {
        System.out.println("Estamos dibujando un rectangulo");
    }

    @Override
    public void rellenar_forma() {
        System.out.println("Estamos rellenando un rectangulo");
    }

    @Override
    public double calcular_area() {
        double areaRectangulo = base * altura;
        System.out.println("El area del rectangulo es: "+areaRectangulo);
        return areaRectangulo;
    }

    @Override
    public double calcular_perimetro() {
        double perimetroCuadrado = (base * 2) + (altura * 2);
        System.out.println("El perimetro del rectangulo es: "+perimetroCuadrado);
        return perimetroCuadrado;
    }


}
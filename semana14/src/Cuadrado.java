public class Cuadrado extends Cuadrilatero implements Forma {
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void dibujar_puntos() {
        System.out.println("Estamos dibujando un cuadrado");
    }

    @Override
    public void rellenar_forma() {
        System.out.println("Estamos rellenando un cuadrado");
    }

    @Override
    public double calcular_area() {
        double areaCuadrado = lado * lado;
        System.out.println("El area del cuadrado es: "+areaCuadrado);
        return areaCuadrado;
    }

    @Override
    public double calcular_perimetro() {
        double perimetroCuadrado = lado * 4;
        System.out.println("El perimetro del cuadrado es: "+perimetroCuadrado);
        return perimetroCuadrado;
    }

}
public class Triangulo extends Trigono implements Forma{
    private double base;
    private double altura;
    public Triangulo() {
    }
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void dibujar_puntos() {
        System.out.println("Estamos dibujando un triangulo");
    }

    @Override
    public void rellenar_forma() {
        System.out.println("Estamos rellenando un triangulo");
    }

    @Override
    public double calcular_area() {
        double areaTriangulo=base*altura/2;
        System.out.println("El area del triangulo es: "+areaTriangulo);
        return areaTriangulo;
    }

    @Override
    public double calcular_perimetro() {
        double perimetroTriangulo=base*3;
        System.out.println("El perimetro del triangulo es: "+perimetroTriangulo);
        return perimetroTriangulo;
    }




}
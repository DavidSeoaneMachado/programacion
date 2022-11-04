package metodo_basico;

public class objeto {

    public static void main(String[] args) {
        calculadora cal = new calculadora(); //Objeto de la clase calculadora (el otro archivo)

        cal.leerNumeros();
        cal.sumar();
        cal.restar();
        cal.multiplicar();
        cal.dividir();
        cal.mostrarResultado();

    }
}